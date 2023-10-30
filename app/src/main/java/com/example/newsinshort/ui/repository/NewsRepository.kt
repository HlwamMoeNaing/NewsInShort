package com.example.newsinshort.ui.repository

import com.example.newsinshort.ui.datalayer.datasource.NewsDatasource
import com.example.newsinshort.ui.datalayer.entity.NewsResponse
import com.example.utilties.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newDataSource: NewsDatasource
) {
    suspend fun getNewHeadlines(country: String): Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())
            val response = newDataSource.getNewsHeadlines(country)
            if (response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {
                emit(ResourceState.Error("Error fetching news Data"))
            }
        }.catch { e ->
            emit(ResourceState.Error(e.localizedMessage ?: "Some error in flow"))
        }
    }
}
package com.example.newsinshort.ui.datalayer.datasource

import com.example.newsinshort.ui.datalayer.api.ApiService
import com.example.newsinshort.ui.datalayer.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewDataSourceImpl @Inject constructor(
    private val apiService:ApiService
):NewsDatasource {
    override suspend fun getNewsHeadlines(country: String): Response<NewsResponse> {
      return apiService.getNewsHeadlines(country)
    }
}
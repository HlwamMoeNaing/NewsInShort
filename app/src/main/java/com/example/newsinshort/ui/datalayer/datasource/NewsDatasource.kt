package com.example.newsinshort.ui.datalayer.datasource

import com.example.newsinshort.ui.datalayer.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.Query

interface NewsDatasource {
   suspend fun getNewsHeadlines(country: String): Response<NewsResponse>
}
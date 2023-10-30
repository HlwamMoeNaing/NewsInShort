package com.example.newsinshort.ui.datalayer.api

import com.example.newsinshort.ui.datalayer.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
   suspend fun getNewsHeadlines(
        @Query("country") country:String,
        @Query("apiKey") apiKey:String = "7f67ebeb45a249669443d687edf61994"
    ):Response<NewsResponse>

    //https://newsapi.org/v2/top-headlines?country=us&apiKey=7f67ebeb45a249669443d687edf61994
}
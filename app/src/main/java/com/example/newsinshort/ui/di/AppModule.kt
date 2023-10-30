package com.example.newsinshort.ui.di

import com.example.newsinshort.ui.datalayer.AppConstant
import com.example.newsinshort.ui.datalayer.api.ApiService
import com.example.newsinshort.ui.datalayer.datasource.NewDataSourceImpl
import com.example.newsinshort.ui.datalayer.datasource.NewsDatasource
import com.example.newsinshort.ui.repository.NewsRepository
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val httpLogingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC
        }
        val httpClient = OkHttpClient().newBuilder().apply {
            addInterceptor(httpLogingInterceptor)
        }
        httpClient.apply {
            readTimeout(60, TimeUnit.SECONDS)
        }

        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory()).build()
        return Retrofit.Builder()
            .baseUrl(AppConstant.BASE_URL)
            .client(httpClient.build())
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsDataSource(apiService: ApiService): NewsDatasource {
        return NewDataSourceImpl(apiService)
    }

    @Provides
    @Singleton
    fun provideNewsRepository(newsDatasource: NewsDatasource): NewsRepository {
        return NewsRepository(newsDatasource)
    }
}
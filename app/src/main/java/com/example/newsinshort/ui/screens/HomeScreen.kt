

package com.example.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsinshort.ui.viewmodels.NewsViewModel
import com.example.utilties.ResourceState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import com.example.newsinshort.ui.components.Loader
import com.example.newsinshort.ui.components.NewList
import com.example.newsinshort.ui.components.NewsRowComponent

const val TAG = "HomeScreen"


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    val newResponse by newsViewModel.news.collectAsState()

    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ) {
     100
    }

    VerticalPager(state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp

    ) {page->
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

            when (newResponse) {
                is ResourceState.Loading -> {
                    Log.d(TAG, "Loading")
                    Loader()
                }

                is ResourceState.Error -> {

                    val resp = (newResponse as ResourceState.Error).error
                    Log.d(TAG, resp.toString())
                }

                is ResourceState.Success -> {
                    Log.d(TAG, "Success")
                    val resp = (newResponse as ResourceState.Success).data
                    Log.d(TAG, resp.totalResults.toString())
                    if (resp.articles.isNotEmpty()){
                        NewsRowComponent(page,resp.articles[page])
                    }
                }
            }
        }

    }


}
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
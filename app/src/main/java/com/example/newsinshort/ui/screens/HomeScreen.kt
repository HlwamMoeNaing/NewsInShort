package com.example.newsinshort.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.newsinshort.ui.components.Loader
import com.example.newsinshort.ui.components.NewList

const val TAG = "HomeScreen"
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {
    val newResponse by newsViewModel.news.collectAsState()
    //7f67ebeb45a249669443d687edf61994
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        when(newResponse){
            is ResourceState.Loading ->{
            Log.d(TAG,"Loading")
                Loader()
            }
            is ResourceState.Error ->{

                val resp = (newResponse as ResourceState.Error).error
                Log.d(TAG,resp.toString())
            }

            is ResourceState.Success ->{
                Log.d(TAG,"Success")
                val resp = (newResponse as ResourceState.Success).data
                Log.d(TAG,resp.totalResults.toString())
                NewList(resp)
            }
        }
    }
}
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
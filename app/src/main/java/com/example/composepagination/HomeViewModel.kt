package com.example.composepagination

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.composepagination.network.ApiService
import com.example.composepagination.paging.AirlinePagingSource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val apiService: ApiService)  : ViewModel() {

    val pager = Pager(
        config = PagingConfig(pageSize = 10,prefetchDistance = 5),pagingSourceFactory = {AirlinePagingSource(apiService = apiService)}
    ).flow.cachedIn(viewModelScope)

}
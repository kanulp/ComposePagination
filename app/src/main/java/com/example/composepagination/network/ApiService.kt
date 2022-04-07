package com.example.composepagination.network

import com.example.composepagination.model.AirlineModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface  ApiService {

    @GET("v1/passenger")
    suspend fun getAirlineResponse(
        @Query("page") page:Int,
        @Query("size") size:Int
    ):Response<AirlineModel>
}
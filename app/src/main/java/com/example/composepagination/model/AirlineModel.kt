package com.example.composepagination.model

data class AirlineModel(
    val `data`: List<Data>,
    val totalPages: Int,
    val totalPassengers: Int
)
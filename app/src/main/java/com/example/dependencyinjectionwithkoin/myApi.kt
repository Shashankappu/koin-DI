package com.example.dependencyinjectionwithkoin

import retrofit2.http.GET

interface myApi {
    @GET("my/endpoint")
    fun callApi()
}
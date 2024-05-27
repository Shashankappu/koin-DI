package com.example.dependencyinjectionwithkoin

class MainRepositoryImpl(
    private val api: myApi
):MainRepository {
    override fun doNetworkCall() {
        api.callApi()
    }

}
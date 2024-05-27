package com.example.dependencyinjectionwithkoin

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository : MainRepository
):ViewModel() {

    fun doNetworkCall(){
        println("Something")
        //repository.doNetworkCall()
    }
}
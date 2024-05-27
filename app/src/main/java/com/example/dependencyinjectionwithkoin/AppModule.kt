package com.example.dependencyinjectionwithkoin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://www.google.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(myApi::class.java)
    }

    ///creates only one instance of an object
    single<MainRepository>{
        MainRepositoryImpl(get())
    }

    //creates an object everytime it is used
//    factory<MainRepository>{
//        MainRepositoryImpl(get())
//    }

    viewModel{
        MainViewModel(get())
    }



}
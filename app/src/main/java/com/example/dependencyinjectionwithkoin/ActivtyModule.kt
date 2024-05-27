package com.example.dependencyinjectionwithkoin

import org.koin.dsl.module

val activityModule = module {
    scope<MainActivity> {
        scoped { "hello" }
    }
}
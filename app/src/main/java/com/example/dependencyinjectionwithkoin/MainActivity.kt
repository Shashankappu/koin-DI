package com.example.dependencyinjectionwithkoin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dependencyinjectionwithkoin.ui.theme.DependencyInjectionWithKoinTheme
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.compose.getViewModel
import org.koin.androidx.scope.activityScope
import org.koin.core.scope.Scope

class MainActivity : ComponentActivity(), AndroidScopeComponent {
    // can be used like this in xml project
   // private val viewModel by viewModel<MainViewModel>()

    //any object needed immediate injection
    //private val api = get<myApi>()

    //for lazy injection of objects
   // private val myApi by inject<myApi>()

    //scoped injection
    override val scope:Scope by activityScope()
    private val hello by inject<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println(hello)
        enableEdgeToEdge()
        setContent {
            DependencyInjectionWithKoinTheme {
                val viewModel = getViewModel<MainViewModel>()
                viewModel.doNetworkCall()
            }
        }
    }
}
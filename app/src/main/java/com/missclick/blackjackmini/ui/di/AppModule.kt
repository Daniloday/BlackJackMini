package com.missclick.blackjackmini.ui.di

import com.missclick.blackjackmini.ui.processSecond.ProcessSecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        ProcessSecondViewModel(get())
    }


}
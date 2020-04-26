package com.hotdogcode.mvvmstep_2.utilities

import com.hotdogcode.mvvmstep_2.data.FruitDatabase
import com.hotdogcode.mvvmstep_2.data.FruitRepo

object Injector {
    fun provideViewModelFactory():ViewModelFactory{
        val fruitRepo = FruitRepo.getInstance(FruitDatabase.fruitDao)
        return ViewModelFactory(fruitRepo)
    }
}
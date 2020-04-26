package com.hotdogcode.mvvmstep_2.utilities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hotdogcode.mvvmstep_2.data.FruitRepo
import com.hotdogcode.mvvmstep_2.view.MainViewModel

class ViewModelFactory(private val fruitRepo: FruitRepo):ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(fruitRepo) as T
    }
}
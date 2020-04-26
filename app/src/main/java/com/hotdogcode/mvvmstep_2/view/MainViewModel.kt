package com.hotdogcode.mvvmstep_2.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotdogcode.mvvmstep_2.data.Fruit
import com.hotdogcode.mvvmstep_2.data.FruitRepo

class MainViewModel(private val fruitRepo: FruitRepo):ViewModel() {
    val currentFruit:LiveData<Fruit>
        get()= fruitRepo.getFruit()

    fun changeRandomFruit(){
        fruitRepo.changeRandomFruit()
    }


    val changable=MutableLiveData<Fruit>()


}
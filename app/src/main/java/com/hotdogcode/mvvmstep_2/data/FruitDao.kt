package com.hotdogcode.mvvmstep_2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class FruitDao {

    private val fruitList :List<String> = listOf(
        "Apple","Orange","Mango"
    )

    private var _fruit = MutableLiveData<Fruit>()


    init {
        _fruit.value = Fruit(fruitList.first())
    }

    fun getFruit()=_fruit
    fun setFruit(fruit: Fruit){
        _fruit.value = fruit
    }

    fun changeRandomFruit(){
        _fruit.value = Fruit(fruitList[Random.nextInt(fruitList.size)])
    }



}
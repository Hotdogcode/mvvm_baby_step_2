package com.hotdogcode.mvvmstep_2.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FruitRepo private constructor(private val fruitDao: FruitDao) {


    fun changeRandonAndReturnFruit():LiveData<Fruit>{
        changeRandomFruit()
        return fruitDao.getFruit()
    }
    fun changeRandomFruit(){
        fruitDao.changeRandomFruit()
    }
    fun getFruit():LiveData<Fruit>{
        return fruitDao.getFruit()
    }
    fun setFruit(fruit: Fruit){
        fruitDao.setFruit(fruit)
    }

    companion object{
        private var instance:FruitRepo? = null
        fun getInstance(fruitDao: FruitDao):FruitRepo{
            return instance ?: synchronized(this){
                instance ?: FruitRepo(fruitDao).also { instance = it }
            }
        }
    }


}
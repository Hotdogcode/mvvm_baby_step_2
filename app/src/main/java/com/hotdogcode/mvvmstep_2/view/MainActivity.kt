package com.hotdogcode.mvvmstep_2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hotdogcode.mvvmstep_2.R
import com.hotdogcode.mvvmstep_2.databinding.ActivityMainBinding
import com.hotdogcode.mvvmstep_2.utilities.Injector

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val factory = Injector.provideViewModelFactory()
        val viewModel = ViewModelProvider(this,factory).get(MainViewModel::class.java)
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).apply {
            this.lifecycleOwner = this@MainActivity
            this.viewModel = viewModel
        }

        viewModel.currentFruit.observe(this , Observer {
            Toast.makeText(this,it.name,Toast.LENGTH_SHORT).show()
        })

    }
}

package com.example.myviewmodeltemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myviewmodeltemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //綁定myViewModel
        val myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
    //綁定DataBinding
      val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)





        dataBinding.setData(myViewModel)
     dataBinding.setLifecycleOwner(this)
    }
}
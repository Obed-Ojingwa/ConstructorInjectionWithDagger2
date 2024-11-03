package com.obedcodes.constructorinjectionwithdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.obedcodes.constructorinjectionwithdagger2.car.Car
import com.obedcodes.constructorinjectionwithdagger2.car.DaggerCarComponent


class MainActivity : AppCompatActivity() {

    private lateinit var car:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.create()
            .getCarComponent()
            .gas


    }
}
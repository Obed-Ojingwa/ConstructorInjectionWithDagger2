package com.obedcodes.constructorinjectionwithdagger2.car.repair.tire

import android.util.Log
import javax.inject.Inject

class Tools @Inject constructor() {

    init {
        Log.i("MYTAG", "Tools created")
    }

    fun getTools(){
        Log.i("MYTAG", "Tools available")
        println("Working")
    }
}
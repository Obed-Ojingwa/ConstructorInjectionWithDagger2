package com.obedcodes.constructorinjectionwithdagger2.car

import android.util.Log
import javax.inject.Inject

class Gas @Inject constructor() {

    init {
        Log.i("MYTAG", "Gas available")
    }


    fun getGas(){
        Log.i("MYTAG", "Gas is full")

    }
}
package com.obedcodes.constructorinjectionwithdagger2.car

import android.util.Log
import javax.inject.Inject

class Engine @Inject constructor(val piston :Piston){

    init{
        Log.i("MYTAG", "Engine created")
    }

    fun getEngine(){
        piston.isPiston()
    }
}
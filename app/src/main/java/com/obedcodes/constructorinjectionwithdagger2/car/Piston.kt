package com.obedcodes.constructorinjectionwithdagger2.car

import android.util.Log
import javax.inject.Inject

class Piston @Inject constructor() {
    init {
        Log.i("MYTAG", "Created")
    }

    fun isPiston(){
        Log.i("MYTAG", "Piston Working")
    }
}
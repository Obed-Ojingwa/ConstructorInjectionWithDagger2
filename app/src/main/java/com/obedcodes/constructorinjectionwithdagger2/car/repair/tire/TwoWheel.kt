package com.obedcodes.constructorinjectionwithdagger2.car.repair.tire

import android.util.Log
import javax.inject.Inject

class TwoWheel @Inject constructor() {

    init {
        Log.i("MYTAG", "Two wheel created")
    }

    fun getTwoWheel(){
        Log.i("MYTAG", "Two wheel available")
    }
}
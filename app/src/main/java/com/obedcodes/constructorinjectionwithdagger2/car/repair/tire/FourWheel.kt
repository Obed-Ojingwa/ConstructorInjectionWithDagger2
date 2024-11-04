package com.obedcodes.constructorinjectionwithdagger2.car.repair.tire

import android.util.Log
import javax.inject.Inject

class FourWheel @Inject constructor() {
    init {
        Log.i("MYTAG", "Four wheel created")

    }
    fun getFourWheel(){
        Log.i("MYTAG", "Four wheel working")
    }

}
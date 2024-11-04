package com.obedcodes.constructorinjectionwithdagger2.car.repair.tire

import android.util.Log
import javax.inject.Inject

class Tire @Inject constructor(val fourWheel: FourWheel, val twoWheel: TwoWheel) {


    init {
        Log.i("MYTAG", "Tire available")

    }

    fun getTireComponent(){
        fourWheel.getFourWheel()
        twoWheel.getTwoWheel()
    }
}
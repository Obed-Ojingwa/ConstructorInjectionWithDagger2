package com.obedcodes.constructorinjectionwithdagger2.car.repair.tire

import android.util.Log
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.FourWheel
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.TwoWheel
import javax.inject.Inject

class Wheel @Inject constructor(val tire: Tire) {

    init {
        Log.i("MYTAG", "Wheel created")
    }

    fun getWheelComponent(){
        tire.getTireComponent()
    }
}
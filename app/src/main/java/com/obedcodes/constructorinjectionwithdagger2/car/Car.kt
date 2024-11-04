package com.obedcodes.constructorinjectionwithdagger2.car

import android.util.Log
import com.obedcodes.constructorinjectionwithdagger2.car.repair.Mechanic
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.Wheel
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheel: Wheel, val gas: Gas, val repair: Mechanic) {


    init
    {
        engine.getEngine()
        wheel.getWheelComponent()
        gas.getGas()
        repair.getMechanic()
    }


    fun startCar(){
        Log.i("MYTAG", "Car started...")

    }

}
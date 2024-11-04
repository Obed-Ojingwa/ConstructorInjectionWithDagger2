package com.obedcodes.constructorinjectionwithdagger2.car.repair

import android.util.Log
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.Tools
import javax.inject.Inject

class Mechanic @Inject constructor(val tools: Tools) {


    init {
        Log.i("MYTAG", "Mechanic available")
    }

    fun getMechanic(){
        tools.getTools()
    }

}
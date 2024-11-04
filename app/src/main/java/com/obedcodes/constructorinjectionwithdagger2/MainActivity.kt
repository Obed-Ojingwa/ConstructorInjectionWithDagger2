package com.obedcodes.constructorinjectionwithdagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.obedcodes.constructorinjectionwithdagger2.car.Car
import com.obedcodes.constructorinjectionwithdagger2.car.DaggerCarComponent
import com.obedcodes.constructorinjectionwithdagger2.car.Engine
import com.obedcodes.constructorinjectionwithdagger2.car.Gas
import com.obedcodes.constructorinjectionwithdagger2.car.Piston
import com.obedcodes.constructorinjectionwithdagger2.car.repair.Mechanic
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.FourWheel
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.Tire
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.Tools
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.TwoWheel
import com.obedcodes.constructorinjectionwithdagger2.car.repair.tire.Wheel


class MainActivity : AppCompatActivity() {

    private lateinit var car:Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerCarComponent.create()
            .getCar()
            .startCar()


    }

}

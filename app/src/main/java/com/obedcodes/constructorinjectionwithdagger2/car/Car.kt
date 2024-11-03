package com.obedcodes.constructorinjectionwithdagger2.car

import com.obedcodes.constructorinjectionwithdagger2.car.repair.Mechanic
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheel: Wheel, val gas: Gas, val repair: Mechanic) {


}
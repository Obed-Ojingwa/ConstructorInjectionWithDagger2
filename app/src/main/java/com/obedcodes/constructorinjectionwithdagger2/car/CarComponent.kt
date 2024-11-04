package com.obedcodes.constructorinjectionwithdagger2.car

import dagger.Component

@Component
interface CarComponent {

    fun getCar() : Car
}
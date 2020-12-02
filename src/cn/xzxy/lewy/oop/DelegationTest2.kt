package cn.xzxy.lewy.oop

import kotlin.reflect.KProperty

/**
 * 委托：属性委托
 */
class MyDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String = "$thisRef, your delegated property name is ${property.name}"

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) = println("$thisRef, now value is $value")
}

class MyPropertyClass {
    var str: String by MyDelegate()
}

fun main(args: Array<String>) {
    val myPropertyClass = MyPropertyClass()
    myPropertyClass.str = "hello oo"
    println(myPropertyClass.str)
}


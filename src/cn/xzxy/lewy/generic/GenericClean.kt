package cn.xzxy.lewy.generic

/**
 * 泛型擦除
 */
class MyStorage<out T>(private var t: T) {
    fun getValue(): T {
        return this.t
    }
    fun setValue(t: @UnsafeVariance T): Unit {
        this.t = t
    }
}

fun main(args: Array<String>) {
    val myStorage: MyStorage<Int> = MyStorage(9)
    val myStorage2: MyStorage<Any> = myStorage

    println(myStorage2.getValue()) // 9

    myStorage2.setValue("oo") // 起初类型是int，这里可以存入string
    println(myStorage2.getValue()) // "oo"
}
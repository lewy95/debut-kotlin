package cn.xzxy.lewy.further

/**
 * 投影分为两种：
 * 1. 使用处型变：类型投影；
 * 2. 星投影；
 *
 * 类型投影：
 *
 */

fun copy(from: Array<Any>, to: Array<Any>) {
    assert(from.size == to.size)
    for (i in from.indices)
        to[i] = from[i]
}

fun main(args: Array<String>) {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any = Array<Any>(3) { "" }
    //copy(ints, any) // 其类型为 Array<Int> 但此处期望 Array<Any>
}
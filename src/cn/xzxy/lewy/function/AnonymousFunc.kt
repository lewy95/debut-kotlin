package cn.xzxy.lewy.function

/**
 * 匿名函数：没有名称
 * 注意：匿名函数只能存在与()中，不能用{}，这一点与lambda不同
 */
fun main(args: Array<String>) {
    // fun(x: Int, y: Int) = x + y

    // fun(x: Int, y: Int): Int {
    //     return x + y
    // }

    val strs = arrayOf("yy", "ym", "sy")
    strs.filter(fun(item): Boolean = item.startsWith("y")).forEach { println(it) }

    val l1 = listOf<String>("a", "b", "c")
    val l2 = listOf<Int>(1, 2, 3)
    val merged = l1 zip l2
    println(merged.first().first) // a
    val filtered = merged.filterNot (fun(tuple): Boolean = tuple.first == "a")
    println(filtered)

}
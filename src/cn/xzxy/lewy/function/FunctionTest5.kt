package cn.xzxy.lewy.function

/**
 * 函数式编程的一些案例
 */

fun main(args: Array<String>) {

    val strs = arrayOf("ym", "yy", "sy", "ly", "qn", "mc")

    val filtered = strs.filter { it.contains("y") }
    println(filtered)

    val filtered2 = strs.filter { it.length > 1 }
    println(filtered2)

    val filtered3 = strs.filter { it.endsWith("y") }.map { it.toUpperCase() }
    println(filtered3)

    val filtered4 = strs.filter {
        it.length < 3
        // lambda 表达式最后一行可以作为返回值
    }
    println(filtered4)

    val filtered5 = strs.filter {
        return@filter it.length < 3
        // lambda 表达式最后一行可以作为返回值，如果硬要用return，需要加上@方法名
    }
    println(filtered5)

}
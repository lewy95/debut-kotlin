package cn.xzxy.lewy.garmmar

/**
 * if 语法
 */
fun statementIf(a: Int, b: Int): Int {
    // return if (a > b) a else b

    // val min = if (a < b) a else b
    // println("min = $min")

    val max = if (a > b) {
        println(a)
        a // 最后一行作为返回值
    } else {
        println(b)
        b
    }
    return max
    //println(max)
}

fun main(args: Array<String>) {
    statementIf(1,2)
}
package cn.xzxy.lewy.debut

fun main() {

    escape()

    // println(sum(2, 3))
    // println(sum(2, 3))

}

// 函数声明的方式
// 法一：
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 法二：
fun sum2(a: Int, b: Int) = a + b

/**
 * 转义 """ """
 */
fun escape(): Unit {
    val s1 = "hello \n oo"
    println(s1)

    val s2 = """hello \n oo"""
    println(s2)
}










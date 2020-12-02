package cn.xzxy.lewy.garmmar

/**
 * 转义 """ """
 */
fun escape(): Unit {
    val s1 = "hello \n oo"
    println(s1)

    val s2 = """hello \n oo"""
    println(s2)
}

fun main() {

    escape()

}
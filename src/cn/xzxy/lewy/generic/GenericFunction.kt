package cn.xzxy.lewy.generic

/**
 * 泛型函数
 */
fun <T> getValue(item: T): T {
    return item
}

fun main() {
    val item = getValue<Int>(3)
    println(item)

    val item2 = getValue<String>("oo")
    println(item2)
}
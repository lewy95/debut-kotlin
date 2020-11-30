package cn.xzxy.lewy.debut

fun main() {
    println(statementWhen1("A"))
    println(statementWhen2(6))
}

fun statementWhen1(string: String): String {
    return when (string) {
        "A" -> "AAA"
        "B" -> "BBB"
        "C" -> "CCC"
        else -> "???"
    }
}

fun statementWhen2(x: Int): Int {
    return when (x) {
        1 -> {
            10
        }
        2 -> {
            20
        }
        3, 4, 5 -> {
            30
        }
        in 6..10 -> {
            40
        }
        else -> {
            50
        }
    }
}

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
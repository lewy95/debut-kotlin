package cn.xzxy.lewy.debut

/**
 * 集合测试
 */
fun main() {
    //testArray()
    //testRange()
    testList()
}

/**
 * 序列
 */
fun testRange(): Unit {
    // 声明方式
    //val r1 = 1..10 // 步长为1
    //val r11 = 1.rangeTo(10) // 步长为1
    //val r2 = 1..10 step 2 // 步长为2
    //val r22 = 1.rangeTo(10) step 2 // 步长为2
    //val r3 = 10.downTo(1) // 步长为1，降序
    val r33 = 10.downTo(1) step 2 // 步长为2，降序

    for (r in r33) println(r)
}

/**
 * 数组
 */
fun testArray(): Unit {
    // intArray int类型数组
    val intArray = intArrayOf(9, 2, 3, 4, 5)
    intArray.forEach(System.out::println)

    for ((index, value) in intArray.withIndex()) {
        println("array[$index] == $value")
    }
}

/**
 * list
 */
fun testList(): Unit {
    val list = listOf<String>("ym", "yy", "sx", "lq", "lt")

    // 案例：
    list.filter { it.startsWith("y") }.map { it.toUpperCase() }.forEach{ println(it) }

    // 扩展：when与集合，从上往下匹配，只有当上一个不匹配时才判断下一个
    when {
        "ymu" in list -> println("ok")
        "lt" in list -> println("??")
    }
}
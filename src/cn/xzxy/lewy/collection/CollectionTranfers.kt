package cn.xzxy.lewy.collection

/**
 * 集合的转换：
 * 1. 映射:
 * 2. 合拢：
 * 3. 关联：
 * 4. 打平：
 */
fun mapping(): Unit {
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { idx, value -> value * idx })
    println("----------------------------")

    // 如果转换在某些元素上产生null值，用mapNotNull从集合中null值
    val numbers2 = setOf(1, 2, 3)
    println(numbers2.mapNotNull { if ( it == 2) null else it * 3 })
    println(numbers2.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })
    println("----------------------------")

    // 映射转换时，有两个选择：转换键，使值保持不变，反之亦然
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.toUpperCase() })
    println(numbersMap.mapValues { it.value + it.key.length })
}

fun zip(): Unit {
    // 拉链操作
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    // 集合的大小不同，则 zip() 的结果为较小集合的大小，结果中不包含较大集合的后续元素
    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))
    println("---------------------------------------")

    val colors2 = listOf("red", "brown", "grey")
    val animals2 = listOf("fox", "bear", "wolf")

    println(colors2.zip(animals2) {
        colors2, animals2 -> "The ${animals2.capitalize()} is $colors2"}
    )
    println("---------------------------------------")

    // 反向拉链 unzipping
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())
}

fun associate(): Unit {
    // associateWith 创建一个 map，其原始集合为键，
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
}

fun main(args: Array<String>) {
    // mapping()
    // zip()
    associate()

}
package cn.xzxy.lewy.function

/**
 * 函数类型
 */
// 无返回值函数
fun testUnit(): Unit {
    /**
     * public object Unit {
     *   override fun toString() = "kotlin.Unit"
     * }
     */
}

// 单表达式函数
fun testFunwc2(a: Int, b:Int) = a + b

// 显示返回类型
// 拥有方法体的函数必须要显示指定返回类型，除非函数返回Unit，此时返回类型可以省略掉。
fun testFunwc3(): Int {
    return 1
}

fun main(args: Array<String>) {


}
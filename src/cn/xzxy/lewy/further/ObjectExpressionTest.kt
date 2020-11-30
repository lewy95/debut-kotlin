package cn.xzxy.lewy.further

/**
 * 对象表达式 ==> 主要解决java中匿名内部类的一些问题
 *
 * 对象表达式的格式：
 * object [: 若干个父类型，中间用逗号分隔]
 */
interface TestInterface {
    fun testPrint(i: Int)
}

abstract class TestAbstractClass {
    abstract val age: Int

    abstract fun printAbstractClassInfo()
}

fun main() {
    // 对象表达式实现接口
    val myObj = object : TestInterface {
        override fun testPrint(i: Int) {
            println("i is $i")
        }
    }
    myObj.testPrint(100)

    println("==================")

    val myObj2 = object : TestInterface, TestAbstractClass() {
        override fun testPrint(i: Int) {
            println("i is $i")
        }

        override val age: Int
            get() = 80

        override fun printAbstractClassInfo() {
            println("printAbstractClassInfo invoked")
        }
    }

    println(myObj2.age)
    myObj2.testPrint(99)
    myObj2.printAbstractClassInfo()

    println("==================")

    val myObj3 = object {
        init {
            println("初始化块执行")
        }
        var myProperty = "oo"
        fun myMethod() = "myMethod"
    }

    println(myObj3.myProperty)
    println(myObj3.myMethod())
}
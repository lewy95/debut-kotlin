package cn.xzxy.lewy.further

/**
 * 密封类：sealed class
 * 密封类及其子类必须定义在一个文件中，有点类似枚举的意思
 */
sealed class Calculator

class Add : Calculator()

class Subtract : Calculator()

class Multiply : Calculator()

fun calculator(a: Int, b: Int, cal: Calculator) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
}

fun main() {

}
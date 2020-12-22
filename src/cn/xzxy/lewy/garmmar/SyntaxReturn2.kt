package cn.xzxy.lewy.garmmar

/**
 * 高阶函数，接受一个函数作为参数
 */
fun myReturn(changeFun: () -> Unit) {
  changeFun()
  println("高级函数的Lambda表达式执行完")
}

var list = listOf<Int>(1, 2, 3)

/**
 *  传入作为的参数的函数
 */
fun change() {
  /**
   * Lambda表达式，单个参数，时候可以省略声明参数和->
   */
  list.forEach { item ->
    if (item == 2) return
    println("当前遍历的值是 $item")
  }
  println("list集合遍历完成")
}

fun change2() {
  list.forEach { item ->
    if (item == 2) return@forEach //使用标签
    println("当前遍历的值是 $item")
  }
  println("list集合遍历完成")
}

fun main(args: Array<String>) {
  myReturn { change() }
  println("==========")
  myReturn { change2() }
}
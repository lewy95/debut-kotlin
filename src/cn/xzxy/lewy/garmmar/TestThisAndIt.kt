package cn.xzxy.lewy.garmmar

fun main() {
    val str = "Hello"
    // this
    str.run {
        println("The receiver string length: $length")
        //println("The receiver string length: ${this.length}") // 和上句效果相同
    }

    // it
    str.let {
        println("The receiver string's length is ${it.length}")
    }
    // println("The receiver string's length is ${str.length}") // 和上句效果相同

}
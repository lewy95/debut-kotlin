package cn.xzxy.lewy.garmmar

fun main(args: Array<String>) {
  val p = TPerson2("Muller", 30, "Munchen").apply {
    age = 20                       // 和 this.age = 20 或者 adam.age = 20 一样
    location = "London"
  }
  println(p.location)
}

class TPerson2(val name: String, var age: Int = 10, var location: String) {

  fun moveTo(newPlace: String): Unit {
    println("now in $newPlace")
  }

  fun incrementAge(): Int {
    println("one year older")
    return age + 1
  }
}
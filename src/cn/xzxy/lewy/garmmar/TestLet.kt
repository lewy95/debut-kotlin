package cn.xzxy.lewy.garmmar

fun main(args: Array<String>) {
    TPerson("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }
}

class TPerson(val name: String, private val age: Int = 10, val location: String) {

    fun moveTo(newPlace: String): Unit {
        println("now in $newPlace")
    }

    fun incrementAge(): Int {
        println("one year older")
        return age + 1
    }
}



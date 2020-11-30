package cn.xzxy.lewy.further

/**
 * 枚举类
 */
enum class Seanson {
    SPRING, SUMMER, AUTUMU, WINTER
}

enum class Seanson2(val temperature: Int) {
    SPRING(20), SUMMER(38), AUTUMU(15), WINTER(6)
}

enum class Season3 {
    SPRING {
        override fun getSeason(): Season3 = SPRING
    },
    SUMMER {
        override fun getSeason(): Season3 = SUMMER
    },
    AUTUMU {
        override fun getSeason(): Season3 = AUTUMU
    },
    WINTER {
        override fun getSeason(): Season3 = WINTER
    };

    abstract fun getSeason(): Season3
}

fun main() {
    val seanson = Seanson.values()
    seanson.forEach { println(it) }

    val season = Seanson.valueOf("SPRING")
}


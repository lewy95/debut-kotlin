package cn.xzxy.lewy.generic

/**
 * 泛型约束
 */
// T的上界是List<T>
class UpperBoundsClass<T: List<T>> {
}

class UpperBoundsClass2<T> where T: Comparable<T>, T: Any {
}

fun main() {
    val upperBoundsClass = UpperBoundsClass2<String>()
}
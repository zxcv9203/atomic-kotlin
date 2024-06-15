package chapter04.atom50

/**
 * Map을 사용하면 키를 사용에 값을 빠르게 접근할 수 있습니다.
 */

fun main() {
    val map = mapOf(
        "key1" to "value1",
        "key2" to "value2",
        "key3" to "value3"
    )

    println(map["key1"]) // value1
    println(map["key2"]) // value2
    println(map["key3"]) // value3
}
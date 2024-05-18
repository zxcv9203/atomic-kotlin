package chapter02.atom27

/**
 * Map은 키와 값을 연결하고 키가 주어지면 그 키와 연결된 값을 찾아줍니다.
 *
 * mapOf() 함수는 불변 맵을 생성합니다.
 */

fun main() {
    // Map은 키와 값을 연결하고 키가 주어지면 그 키와 연결된 값을 찾아줍니다.
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    // 키로 값을 찾기
    println(map["a"]) // 1

    // 키가 없으면 null을 반환
    println(map["z"]) // null

    // null이 될 수 없는 값을 반환하려면 getValue() 함수를 사용합니다.
    println(map.getValue("a")) // 1
    // 다음과 같이 Map에 들어갈 타입을 명시할 수 있음
    val numbers: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)

    // 변경 가능한 맵을 생성하려면 mutableMapOf() 함수를 사용합니다.
    val mutableMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    mutableMap["d"] = 4
    println(mutableMap)

    // 불변 맵에 += 연산자를 사용하면 새로운 맵을 생성합니다.
    var map2 = mapOf("a" to 1, "b" to 2, "c" to 3)
    map2 += "d" to 4
    println(map2)
}
package chapter04.atom45

/**
 * 람다는 변수로 담을 수 있기 때문에 여러 함수에 람다를 넘기면서 재사용할 수 있습니다.
 */

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val minus = { x: Int, y: Int -> x - y }

    println(sum(1, 2)) // 3
    println(minus(1, 2)) // -1

    // 람다는 자신의 영역 밖에 있는 요소를 참조할 수 있는 클로저라고 하는 기능이 존재합니다.
    // 클로저는 람다가 정의된 영역의 변수를 참조할 수 있게 해줍니다.
    val a = 10
    val closure = { x: Int -> x + a }
    println(closure(1)) // 11
}
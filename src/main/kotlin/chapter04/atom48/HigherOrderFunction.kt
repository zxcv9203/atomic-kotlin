package chapter04.atom48

/**
 * 프로그래밍 언어에서 함수를 다른 함수의 인자로 넘길 수 있거나 함수가 반환값으로 함수를 돌려줄 수 있으면, 언어가 고차 함수를 지원한다고 말합니다.
 */

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val minus = { x: Int, y: Int -> x - y }

    println(sum(1, 2)) // 3
    println(minus(1, 2)) // -1

    val a = 10
    val closure = { x: Int -> x + a }
    println(closure(1)) // 11
}
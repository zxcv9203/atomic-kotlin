package chapter01.atom10

/**
 * && : 연산자 오른쪽과 왼쪽에 있는 Boolean 식이 모두 true일때만 true를 반환
 * || : 연산자 오른쪽과 왼쪽에 있는 Boolean 식 중 하나라도 true이면 true를 반환
 */
fun main() {
    println(true && true) // true
    println(true && false) // false
    println(false && false) // false

    println(true || true) // true
    println(true || false) // true
    println(false || false) // false
}
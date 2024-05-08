package chapter01.atom06

/**
 * fun 함수 이름 (p1: 타입1, p2: 타입2, ...): 반환 타입 {
 *    함수 본문
 *    return 반환 값
 *    반환 값이 없는 경우 반환 타입은 Unit (생략 가능)
 * }
 */
fun main() {
    val r = multiplyByTwo(5)
    println(r)
    println(multiplyByThree(5))
    println(multiplyByFour(5))
}

fun multiplyByTwo(i: Int): Int {
    return i * 2
}

/**
 * 함수 본문이 하나의 식으로 이루어진 경우 중괄호를 생략할 수 있음
 * fun 함수 이름 (p1: 타입1, p2: 타입2, ...): 반환 타입 = 식
 */
fun multiplyByThree(i: Int): Int = i * 3

/**
 * 반환값을 명시하지 않으면 함수의 반환 타입을 추론합니다.
 */
fun multiplyByFour(i: Int) = i * 4
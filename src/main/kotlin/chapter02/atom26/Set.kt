package chapter02.atom26

/**
 * Set은 각각의 값이 오직 하나만 존재할 수 있는 컬렉션입니다.
 */

fun main() {
    // 가장 일반적인 Set 연산은 in이나 contains() 함수를 사용하여 원소인지 검사하는 것 입니다.
    val intSet = setOf(1, 1, 2, 3, 3)

    // Set은 중복된 원소를 허용하지 않습니다.
    println(intSet == setOf(1, 2, 3))

    // 원소 순서는 중요하지 않습니다.
    println(intSet == setOf(3, 2, 1))

    // 원소인지 검사
    println((9 in intSet)) // 9는 존재하지 않음으로 false
    println((1 in intSet)) // 1은 존재하므로 true

    // 이 집합이 다른 집합을 포함하는가?
    intSet.containsAll(setOf(1, 2))

}
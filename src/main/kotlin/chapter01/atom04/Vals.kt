package chapter01.atom04

/**
 * val는 변수를 선언할 때 사용하는 키워드 (value의 줄임말)
 * val은 내용을 다시 대입할 수 없음
 * val 식별자 = 값
 */
fun main() {
    val whole = 11
    val fractional = 1.4
    val words = "Twas Brilling"

    // whole = 14 // Error: val은 변경할 수 없음

    println(whole)
    println(fractional)
    println(words)
}
package chapter03.atom33

/**
 * 패턴에 따라 어떤 동작을 수행할 때 두 세가지 이상의 선택지가 존재한다면 when 표현식을 사용하면 깔끔하게 작성할 수 있습니다.
 *
 * when의 인자로는 임의의 식이 올 수 있으며, 매치 조건에도 아무 값이나 올 수 있습니다. (상수가 아니어도 상관없음)
 */

fun main() {
    val i = 1
    when(i) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Unknown")
    }
}
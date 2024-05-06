package chapter01.sector12

/**
 * for는 반복문을 사용할 때 사용하는 키워드
 * for (식별자 in 범위) { ... }
 *
 */
fun main() {
    // .. 연산자를 사용하여 범위를 만들 수 있음
    for (i in 1..3) {
        println(i)
    }

    // 다음과 같이 범위를 선언할 수 있음
    val range1 = 1..5 // 1 ~ 5
    val range2 = 1 until 5 // 1 ~ 4
    val range3 = 5 downTo 1 // 5 ~ 1
    val range4 = 0..9 step 2 // 0, 2, 4, 6, 8
    val range5 = 9 downTo 0 step 3 // 9, 6, 3, 0

    // 다음과 같이 문자 범위를 사용할 수도 있음
    for (c in 'a'..'z') {
        print(c)
    }
    println()

    val s = "asd"
    for (i in 0..s.lastIndex) {
        println(s[i])
    }

    for (ch in "asd ") {
        println(ch)
    }

    // 단순히 반복하고 싶다면 repeat()를 사용할 수 있음
    repeat(2) {
        println("Hello")
    }
}
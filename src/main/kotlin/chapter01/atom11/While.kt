package chapter01.atom11

/**
 * while은 조건이 true인 동안 반복
 * 루프를 시작할 때 Boolean식을 한 번 평가하고 다시 반복하기 전에 다시 평가함
 */
fun main() {
    // while
    var i = 0
    while (condition(i)) {
        println("i = $i")
        i += 10
    }

    // do while
    // do-while은 Boolean식이 false를 돌려줘도 본문이 최소 한번은 실행됩니다.
    do {
        println("i = $i")
        i += 10
    } while (condition(i))
}

fun condition(i: Int) = i < 100

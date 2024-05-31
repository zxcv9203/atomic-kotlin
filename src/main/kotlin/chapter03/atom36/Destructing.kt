package chapter03.atom36

/**
 * Pair 클래스를 사용하면 두 개의 값을 하나로 묶을 수 있습니다.
 *
 * 이때 구조 분해 선언을 사용하면 여러 식별자를 동시에 선언하면서 초기화할 수도 있습니다.
 */
fun main() {
    Pair(1, 2).let { (a, b) ->
        println("$a $b") // 1 2
    }

    // 구조 분해 선언
    val (a, b) = Pair(1, 2)

    // data 클래스는 자동으로 구조 분해 선언을 지원합니다.
    val computation = Computation(42, "42 is the answer")
}

data class Computation(
    val data: Int,
    val info: String
)
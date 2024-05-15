package chapter02.atom23

/**
 * 예외는 프로그램 실행 중에 발생하는 오류를 말합니다.
 *
 * 예외가 던져지면 실행 경로가 중단되고, 예외 객체는 현재 문맥을 벗어납니다.
 *
 * 예외를 잡아내지 않으면 프로그램이 중단되면서 예외에 대한 정보가 들어 있는 스택 트레이스가 출력됩니다.
 */

fun main() {
    // 예외가 발생하는 코드
//    val i = "1$".toInt()
//    println(i)

    averageIncome(3300, 0)
}

/**
 * 다음 함수와 같이 예외를 직접 작성할 수 있습니다.
 */
fun averageIncome(income: Int, months: Int) =
    if (months == 0)
        throw IllegalArgumentException("월 수는 0보다 커야 합니다.")
    else
        income / months

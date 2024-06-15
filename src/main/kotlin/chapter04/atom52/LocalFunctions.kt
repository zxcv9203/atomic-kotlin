package chapter04.atom52

/**
 * 다른 함수 안에 정의된 이름 붙은 함수를 지역 함수라고 부릅니다.
 *
 * 반복되는 코드를 지역함수로 추출하면 중복을 줄일 수 있습니다.
 *
 * 지역함수는 클로저이기 때문에 자신을 둘러싼 환경의 var나 val을 사용할 수 있습니다.
 */
fun main() {
    val logMsg = StringBuilder()
    fun log(message: String) = logMsg.appendLine(message)
    log("Starting computation")
    val x = 42
    log("Comutation result: $x")
    val toString = logMsg.toString()
    println(toString)

    // 지역 확장 함수
    fun String.lastChar() = get(length - 1)


}
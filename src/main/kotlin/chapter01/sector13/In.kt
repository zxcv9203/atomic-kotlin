package chapter01.sector13

/**
 * in 키워드는 어떤 값이 주어진 범위 안에 들어 있는지 검사합니다.
 */
fun main() {
    val number = 35
    // 두 식은 같은 의미임
    println(0 <= number && number <= 100)
    println(number in 0..100)

    // 문자열에도 in 키워드를 이용하여 특정 문자가 존재하는지 확인할 수 있음
    println('o' in "Kotlin")
    println("in" !in "Kotlin")

    // 다음과 같이 Double 범위도 만들 수 있음
    val x = 2.0
    println(x in 1.0..2.0)

    // 코틀린 1.8 부터 반 열린 범위를 만들어내는 ..<를 쓸 수 있음
    println(x in 1.0..< 2.0) // 2.0 미만이기 때문에 false 반환


}
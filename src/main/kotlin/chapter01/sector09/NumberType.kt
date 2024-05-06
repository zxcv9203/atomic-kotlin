package chapter01.sector09

fun main() {
    // 정숫값을 대입하면 Int로 추론
    // 가독성을 위해 숫자 사이에 _를 넣을 수 있음
    val milion = 1_000_000

    println(bmi(75.0, 1.73))

    // 코틀린은 정수를 다른 정수로 나누면 버림으로 처리함
    // 이를 막기 위해서는 Double형을 앞에 연산하거나 형변환을 진행해야함
    val bmi =  160 / (70 * 70) * 703.07
    println(bmi)
    val bmiDouble = 703.07 * 160 / (70 * 70)
    println(bmiDouble)

    // L을 사용해 명시적으로 Long 타입을 선언할 수 있음
    val l = 1L
}

fun bmi(weight: Double, height: Double): String {
    val bmi = weight / (height * height)
    return if (bmi < 18.5) "underweight"
    else if (bmi < 25) "normal"
    else "overweight"
}
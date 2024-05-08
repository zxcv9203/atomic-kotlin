package chapter01.atom05

fun main() {
    println("Sally" + 5.9)

    // 다음은 컴파일 에러가 발생함 문자열 * 숫자는 코틀린이 어떻게 처리해야하는지 모름
//    println("Sally" * 5.9)

    // 코틀린은 타입을 지정하지 않으면 주어진 값을 통해 타입을 추론함 (타입 추론)

    // 다음과 같이 타입을 지정할 수 있음
    // var 식별자: 타입 = 값
    val whole: Int = 5
    val fractional: Double = 5.9
    val trueOrFalse: Boolean = true
    val words: String = "aValue"
    val Character: Char = 'z'
    val lines: String = """
        This is a string
        that spans multiple lines
    """

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(words)
    println(Character)
    println(lines)
}
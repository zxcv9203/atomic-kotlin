package chapter03.atom37

/**
 * 자바에서는 null 또는 의미 있는 값이 결과가 되도록 허용합니다.
 * 하지만 null을 정상적인 값과 같은 방식으로 다루면 NullPointerException이 발생할 수 있습니다.
 * 코틀린은 null을 다루는 방식을 엄격하게 제한하여 NullPointerException을 방지합니다.
 *
 * 코틀린에서 모든 타입은 기본적으로 널이 될 수 없는 타입입니다.
 * 하지만 무언가 null 결과를 내놓을 수 있다면 타입 이름 뒤에 물음표를 붙여서 결과가 null이 될 수도 있음을 표시해야 합니다.
 */

fun main() {
    // val s: String = null // 컴파일 에러
    val s: String? = null
    println(s) // null
    // println(s.length) // 컴파일 에러
    println(s?.length) // null
    println(s?.length ?: 0) // 0
    println(s!!.length) // NullPointerException
}
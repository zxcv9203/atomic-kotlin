package chapter03.atom39

/**
 * 널 아님 단언은 null이 될 수 없는 상황에서 사용됩니다.
 * .!!을 사용하면 널 아님 단언을 사용할 수 있습니다.
 *
 * 널 아님 단언을 사용하지 않고 안전한 호출이나 명시적인 null 검사를 활용하는 것이 좋습니다.
 * 널 아님 단언은 코틀린과 자바 상호 작용하는 경우와 코틀린이 널 가능성을 제대로 검사하지 못하는데 대상이 null이 아님을 알 수 있는 경우를 위해 도입됐습니다.
 */
fun main() {
    val s: String? = null
    println(s!!.length) // NullPointerException
}
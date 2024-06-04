package chapter03.atom40

/**
 *
 */
fun main() {
    val s: String? = null
    // 해당 확장함수는 s에 대해 널 가능성을 명시하고 있음으로 널인데도 체크하지 않고 정상 동작할 수 있습니다.
    s.isNullOrBlank()
}
package chapter03.atom42

/**
 * 확장 함수를 정의할 수 있는 것 처럼 확장 프로퍼티도 정의할 수 있습니다.
 *
 */

// 확장 대상 타입이 함수나 프로퍼티 이름 바로 앞에 옵니다.
val String.indices: IntRange
    get() = 0 until length

// 제네릭 확장 프로퍼티를 정의할 수 도 있습니다.
val <T> List<T>.firstOrNull: T?
    get() = if (isEmpty()) null else this[0]

// 코틀린 스타일 가이드는 함수가 예외를 던질 경우 프로퍼티보다는 함수를 사용하는 것을 권장합니다.
// 제네릭 인자 타입을 사용하지 않으면 *로 대체할 수 있습니다. (이를 스타 프로젝션이라고 부릅니다.)
// List<*>을 사용하면 List에 담긴 원소의 타입 정보를 모두 잃어버리기 때문에 Any? 타입과 같습니다.
val List<*>.indices: IntRange
    get() = 0 until size
fun main() {
    val indices = "abc".indices
    println(indices)

    val firstOrNull = listOf(1, 2, 3).firstOrNull
    println(firstOrNull)

    val indices1 = listOf(1).indices
    println(indices1)
}
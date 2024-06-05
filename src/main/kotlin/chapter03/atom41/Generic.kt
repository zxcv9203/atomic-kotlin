package chapter03.atom41

/**
 * 제네릭은 파라미터화한 타입을 만듭니다. 파라미터화한 타입은 여러 타입에 대해 작동할 수 있는 컴포넌트입니다.
 *
 * 제네릭 타입을 정의하려면 클래스 이름 뒤에, 내부에 하나 이상의 제네릭 플레이스 홀더가 들어있는 부등호를 추가하면 됩니다.
 */
class GenericHolder<T>(
    private val value: T
) {
    fun getValue(): T = value
}

/**
 * 제네릭 함수를 정의하려면 부등호로 둘러싼 제네릭 타입 파라미터를 함수 이름 앞에 붙이면 됩니다.
 */
fun <T> identity(arg: T): T = arg

fun main() {
    val stringHolder = GenericHolder("Hello, World!")
    val intHolder = GenericHolder(42)

    println(stringHolder.getValue()) // Hello, World!
    println(intHolder.getValue()) // 42

    println(identity("Hello, World!")) // Hello, World!
}
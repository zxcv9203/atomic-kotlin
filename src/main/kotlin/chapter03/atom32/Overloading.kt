package chapter03.atom32

/**
 * 함수 오버로딩은 같은 이름을 가진 함수를 여러 개 정의하는 것을 말합니다.
 * 함수 오버로딩은 함수의 시그니처가 다르면 같은 이름을 가진 함수를 여러 개 정의할 수 있습니다.
 * 함수 시그니처란 함수의 이름과 매개변수의 타입, 개수, 순서를 말합니다.
 *
 * 디폴트 인자를 지원하지 않는 언어에서는 종종 디폴트 인자를 흉내 내기 위해 오버로딩을 활용합니다.
 *
 * 어떤 클래스 안에 확장 함수와 시그니처가 똑같은 멤버 함수가 들어 있으면 코틀린은 멤버 함수를 우선시 합니다.
 * 하지만 확장 함수를 가지고 멤버 함수를 오버로딩할 수 있습니다.
 */

class Overloading {
    fun f() = 0
    fun f(n: Int) = n + 2
}

fun main() {
    val o = Overloading()
    println(o.f()) // 0
    println(o.f(10)) // 12


    foo() // 14 (가장 가깝게 일치하는 foo()가 호출됨)
}

/**
 * 함수 오버로딩과 디폴트 인자를 함께 사용하는 경우, 오버로딩한 함수를 호출하면 함수 시그니처와 함수 호출이 가장 가깝게 일치되는 함수를 호출합니다.
 */

fun foo(n: Int = 99) = println("$n")
fun foo() = foo(14)

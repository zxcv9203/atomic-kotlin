package chapter3

/**
 * 코틀린 확장 함수는 기존 클래스에 멤버 함수를 추가하는 것과 같은 효과를 가집니다.
 * 확장할 대상 타입은 수신 객체 타입이라고 부릅니다.
 *
 * 확장 함수를 정의하기 위해서는 함수 이름 앞에 수신 객체 타입을 붙여야 합니다.
 *
 * 확장함수를 다른 패키지에서 사용하려면 확장 함수를 정의한 패키지를 임포트해야합니다.
 */

fun String.singleQuote() = "'$this'"

fun main() {
    println("Hello, World!".singleQuote()) // 'Hello, World!'
}
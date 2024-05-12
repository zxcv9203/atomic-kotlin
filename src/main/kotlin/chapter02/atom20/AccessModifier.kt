package chapter02.atom20

/**
 * 코틀린에서는 가시성을 제어하기 위해 접근 제어자를 제공합니다.
 *
 * 개발자는 public, private, protected, internal 등의 접근 제어자를 사용해 클래스나 함수, 프로퍼티의 가시성을 제어할 수 있습니다.
 *
 * - public : 모든 곳에서 접근할 수 있습니다. (기본값)
 * - private : 같은 파일 내에서만 접근할 수 있습니다.
 * - protected : 하위 클래스에서만 접근할 수 있습니다.
 * - internal : 같은 모듈 내에서만 접근할 수 있습니다.
 */

private var index = 0 // private 최상위 프로퍼티

private class Animal(val name: String) // private 클래스

private fun recordAnimal() { // private 함수
    val a = Animal("Daisy")
    println("Animal recorded: ${a.name}")
}
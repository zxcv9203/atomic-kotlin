package chapter02.atom19

/**
 * 생성자에 정보를 전달해 새 객체를 초기화할 수 있습니다.
 * 생성자는 새 객체를 초기화하는 특별한 멤버 함수와 비슷합니다.
 * 코틀린에서는 new가 불필요한 중복이라고 판단하기 때문에 제외합니다.
 */
fun main() {
    val wobat = Wobat()
    val alien = Alien("ET")
    println(alien.greeting)
    // 생성자 밖에서는 name에 접근할 수 없습니다.
    // alien.name // error: Unresolved reference: name
    val mutableNameAlien = MutableNameAlien("ET")
    println(mutableNameAlien.name)

    // println은 객체의 toString()을 호출합니다.
    println(alien) // 기본으로 생성된 toString()
    println(mutableNameAlien) // 재정의한 toString()
}

class Wobat

/**
 * 생성자에게 정보를 전달할 때는 파라미터 목록을 사용합니다.
 */
class Alien(name: String) {
    val greeting = "Poor humans, I am $name."
}

/**
 * 클래스 본문 밖에서 생성자 파라미터에 접근할 수 있게 하려면 파라미터 목록에 val이나 var를 추가합니다.
 */
class MutableNameAlien(var name: String) {
    val greeting = "Poor humans, I am $name."

    @Override
    override fun toString(): String {
        return "Alien(name='$name')"
    }
}
package chapter02.atom17


// 클래스 정의
class Giraffe
class Bear
class Hippo

/**
 * 복잡한 클래스를 만들 때는 중괄호를 사용해서 클래스의 특성이나 행동 양식을 포함하는 클래스 본문을 정의함
 * 코틀린에서는 본문에 정의한 함수를 멤버 함수라고 부름 (클래스에 정의되지 않은 함수는 최상위 함수라고 부름)
 */
class Dog {
    // 멤버 함수
    fun bark() = "Bark!"
}

fun main() {
    // 객체 생성
    val g1 = Giraffe()
    val g2 = Giraffe()
    val b = Bear()
    val h = Hippo()

    // Giraffe(), Bear(), Hippo() 처럼 클래스이름()을 호출해 만든 객체는 각각 고유한 정체성을 가집니다.
    println(g1)
    println(g2)
    println(b)
    println(h)
    // 멤버 함수 호출
    println(Dog().bark())
}


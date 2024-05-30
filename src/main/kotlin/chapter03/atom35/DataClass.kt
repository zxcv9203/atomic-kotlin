package chapter03.atom35

/**
 * 데이터 클래스는 데이터를 저장하기 위한 클래스를 쉽게 만들 수 있도록 도와줍니다.
 *
 * 데이터 클래스를 만들기 위해서는 data 키워드를 클래스 앞에 붙이면 됩니다.
 * 이때 모든 생성자 파라미터를 var나 val로 선언해야 합니다.
 *
 * 데이터 클래스는 toString()과 equals(), hashCode()를 자동으로 생성해줍니다.
 *
 * 데이터 클래스는 copy() 함수를 제공합니다. copy() 함수를 사용하면 객체를 복사하면서 일부 프로퍼티를 변경할 수 있습니다.
 *
 * data 클래스를 만들면 객체를 HashMap이나 HashSet에 넣을 때 키로 사용할 수 있는 해시 함수를 자동으로 만들어줍니다.
 */

data class Simple(
    val arg1: String,
    var arg2: Int
)

fun main() {
    val s1 = Simple("Hello", 10)
    val s2 = Simple("Hello", 10)
    val s3 = Simple("World", 20)

    println(s1) // Simple(arg1=Hello, arg2=10)
    println(s2) // Simple(arg1=Hello, arg2=10)
    println(s3) // Simple(arg1=World, arg2=20)

    println(s1 == s2) // true
    println(s1 == s3) // false

    val s4 = s1.copy(arg2 = 20)
    println(s4) // Simple(arg1=Hello, arg2=20)

}
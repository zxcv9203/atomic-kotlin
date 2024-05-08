package chapter02.atom18

/**
 * 프로퍼티는 클래스나 객체에 속한 변수를 말합니다.
 * 프로퍼티는 val과 var로 선언할 수 있습니다.
 * - val : 읽기 전용 프로퍼티로, 값을 한 번 할당하면 변경할 수 없습니다.
 * - var : 읽기/쓰기 프로퍼티로, 값을 할당하거나 변경할 수 있습니다.
 */

class Cup {
    var percentFull = 0
}

/**
 * 최상위 프로퍼티는 클래스 밖에 선언된 프로퍼티를 말합니다.
 * 하지만 최상위 프로퍼티를 사용하는 것은 안티패턴으로 간주됩니다.
 * 프로그램이 복잡해질 수록 공유된 가변 상태에 대해 제대로 추론하기가 어려워지기 때문입니다.
 */
var count = 0

fun main() {
    val c1 = Cup()
    c1.percentFull = 10

    println(c1.percentFull)
}
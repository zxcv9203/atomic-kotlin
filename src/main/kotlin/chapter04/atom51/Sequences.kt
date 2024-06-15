package chapter04.atom51

/**
 * 시퀀스는 컬렉션과 비슷하지만, 요소를 계산하는 방식이 다릅니다.
 *
 * 시퀀스는 게으른 계산을 하기 때문에, 필요할 때만 계산을 합니다.
 * 시퀀스는 중간 연산과 최종 연산으로 나뉩니다.
 * 중간 연산은 다른 시퀀스를 반환하며, 최종 연산은 결과를 반환합니다.
 *
 * 코틀린 Sequence를 다른 함수형 언어에서는 스트림이라고 부릅니다.
 */

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.asSequence()
        .map { it * 2 }
        .filter { it > 5 }
        .toList()
    println(result) // [6, 8, 10]
}
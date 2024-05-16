package chapter02.atom24

/**
 * 리스트는 컨테이너, 즉 다른 객체를 담는 객체에 속합니다.
 *
 * 컨테이너는 컬렉션이라고도 합니다.
 */

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)

    var result = ""

    // 리스트의 각 원소에 대해 이터레이션
    for (i in ints) {
        result += "$i "
    }
    println(result)

    // 리스트의 특정 원소에 접근 (인덱스는 0부터 시작)
    println(ints[4])

    // 다음과 같이 List에 들어갈 타입을 명시할 수 있음
    val numbers: List<Int> = listOf(1, 2, 3)


    // listOf() 함수는 불변 리스트를 생성합니다.
    // 변경 가능한 리스트를 생성하려면 mutableListOf() 함수를 사용합니다.
    val list = mutableListOf(1, 2, 3)
    list.add(1)
    println(list)

    // 불변 리스트에 += 연산자를 사용하면 새로운 리스트를 생성합니다.
    var list2 = listOf(1, 2, 3)
    list2 += 4
}
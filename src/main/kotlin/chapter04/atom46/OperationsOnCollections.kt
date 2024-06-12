package chapter04.atom46

/**
 * 코틀린은 컬렉션에 대해 다양한 연산을 제공합니다.
 * 이러한 연산은 컬렉션을 변경하지 않고 새로운 컬렉션을 반환합니다.
 */

fun main() {
    // 람다는 인자로 추가할 원소의 인덱스를 받습니다.
    val list1 = List(10) { it }
    println(list1)

    // 한 값으로만 이루어진 리스트
    val list2 = List(10) { 0 }
    println(list2)

    // 글자로 이루어진 리스트
    val list3 = List(10) { 'a' + it }
    println(list3)

    // 정해진 순서를 반복
    val list4 = List(10) { list3[it % 3]}
    println(list4)

    // filter()는 조건을 만족하는 원소만 남깁니다.
    val list5 = list1.filter { it % 2 == 0 }
    println(list5)

    // any()는 원소 중 어느 하나에 대해 술어가 true를 반환하면 true를 반환합니다.
    println(list1.any { it % 2 == 0 })

    // all()은 모든 원소에 대해 술어가 true를 반환하면 true를 반환합니다.
    println(list1.all { it % 2 == 0 })

    // none()은 모든 원소에 대해 술어가 false를 반환하면 true를 반환합니다.
    println(list1.none { it % 2 == 0 })

    // count()는 조건을 만족하는 원소의 개수를 반환합니다.
    println(list1.count { it % 2 == 0 })

    // find()는 조건을 만족하는 첫 번째 원소를 반환합니다. (예외 발생)
    println(list1.find { it % 2 == 0 })

    // firstOrNull()은 조건을 만족하는 첫 번째 원소를 반환하거나 없으면 null을 반환합니다.
    println(list1.firstOrNull { it % 2 == 0 })

    // lastOrNull()은 조건을 만족하는 마지막 원소를 반환하거나 없으면 null을 반환합니다.
    println(list1.lastOrNull { it % 2 == 0 })

    // partition()은 조건을 만족하는 원소와 만족하지 않는 원소를 나눠서 Pair로 반환합니다.
    val (even, odd) = list1.partition { it % 2 == 0 }
    println(even)
    println(odd)

    // filterNotNull()은 null이 아닌 원소만 남깁니다.
    val list6 = listOf(1, null, 2, null, 3)
    println(list6.filterNotNull())
}
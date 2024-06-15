package chapter04.atom49

/**
 * zipping(묶기)과 flatting(평탄화)은 리스트를 조작하는 두 가지 기본적인 방법입니다.
 */

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(6, 7, 8, 9, 10)

    // zip은 두 리스트를 묶어주는 역할을 합니다.
    // 두 리스트의 각 요소를 Pair로 묶어줍니다.
    val zipped = list1.zip(list2)
    println(zipped) // [(1, 6), (2, 7), (3, 8), (4, 9), (5, 10)]

    // 람다를 사용해 두 리스트의 각 요소를 조합할 수 있습니다.
    val zippedWith = list1.zip(list2) { a, b -> a * b }
    println(zippedWith) // [6, 14, 24, 36, 50]

    // flatMap은 리스트의 리스트를 평탄화합니다.
    val nestedList = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    val flattened = nestedList.flatMap { it }
    println(flattened) // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    // 람다를 사용해 각 요소를 조합할 수 있습니다.
    val flattenedWith = nestedList.flatMap { it.map { it * 2 } }
    println(flattenedWith) // [2, 4, 6, 8, 10, 12, 14, 16, 18]
}
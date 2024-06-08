package chapter03.atom43

/**
 * 코틀린에서는 자바와 마찬가지로 break와 continue를 사용할 수 있습니다.
 *
 * for문에서 break는 루프를 종료하고, continue는 루프의 다음 단계로 넘어갑니다.
 * break와 continue는 루프의 중첩에서 사용할 수 있습니다.
 *
 * 레이블을 사용하면 break와 continue가 자신을 둘러싼 여러 루프의 경계 중 한군데로 점프할 수 있습니다.
 * 레이블@과 같이 레이블 이름 다음에 @을 사용해 레이블을 붙일 수 있습니다.
 *
 * break와 continue를 사용하면 코드가 복잡해지고 유지 보수가 어려워질 수 있습니다.
 * 두 명령은 goto보다는 낫지만 여전히 프로그램 흐름을 방해합니다.
 *
 * 루프 전체나 루프 본문을 별도의 함수를 추출하면 break나 continue를 return 으로 대체할 수 있습니다.
 */
fun main() {
    val nums = mutableListOf(0)
    for (i in 4 until 100 step 4) {
        if (i == 8) {
            continue
        }
        if (i == 40) {
            break
        }
        nums.add(i)
    }
    println(nums) // [0, 4, 12, 16, 20, 24, 28, 32, 36]

    val strings = mutableListOf<String>()
    outer@for (c in 'A'..'C') {
        for (i in 1..4) {
            if (i == 2) {
                continue@outer
            }
            strings.add("$c$i")
        }
    }
    println(strings)
}
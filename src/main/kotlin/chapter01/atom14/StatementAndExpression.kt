package chapter01.atom14

/**
 * 문(statement)과 식(expression)은 대부분의 프로그래밍 언어에서 가장 작은 코드 조각입니다.
 *
 * 둘 사이에는 다음과 같은 차이가 존재
 * - 문은 효과를 발생시키지만 결과를 내놓지 않습니다.
 * - 식은 항상 결과를 만들어 냅니다.
 *
 * 문은 결과를 내지 않기 때문에 문이 쓸모 있으려면 주변 상태를 변경해야 합니다.
 * 이는 부수 효과를 얻기 위해 문을 사용한다라고 할 수 있습니다.
 */
fun main() {
    // 아무런 결과값도 만들어내지 않기 때문에 for 문을 다른 변수에 대입할 수는 없습니다.
    // for 루프는 부수 효과를 위해서만 사용됩니다.
//    var f = for (i in 1..10) {
//        println(i)
//    }

    // 모든 함수 호출 코드는 식입니다.
    // 함수가 Unit을 반환하고 부수 효과를 목적으로 호출되더라도 여전히 함수 호출 결과를 변수에 대입할 수 있습니다.
    println(unitFunction())
}

fun unitFunction() = Unit
package chapter02.atom21

import kotlin.math.PI
import kotlin.math.cos as cosine

/**
 * 패키지는 연관 있는 코드를 모아둔 것입니다.
 * 각 패키지는 보통 특정 문제를 풀기 위해 고안되며, 여러 함수와 클래스를 포함합니다.
 *
 * 임포트한 패키지에 별칭을 사용하고 싶은 경우 as 키워드를 사용할 수 있습니다.
 * as는 라이브러리에서 이름을 잘못 선택했거나 이름이 너무 길 때 유용합니다.
 *
 * 패키지에 있는 모든 내용을 임포트하고 싶은 경우 별표(*)를 사용할 수 있습니다.
 *
 * 코드를 재사용하고 싶다면 package 키워드를 이용해 코드를 패키지로 묶어서 재사용할 수 있습니다.
 */

fun main() {
    println(PI)
    println(cosine(PI))

}
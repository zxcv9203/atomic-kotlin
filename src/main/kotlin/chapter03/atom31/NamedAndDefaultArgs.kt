package chapter03.atom31

/**
 * 함수를 호출하면서 이름의 인자를 진행할 수 있습니다.
 *
 * 이름 붙은 인자를 사용하면 코드 가독성이 좋아지며, 함수에 대한 문서를 읽지 않고도 이해할 정도로 코드가 명확해질 수 있습니다.
 * 이름 붙은 인자는 순서를 바꿀 수도 있으며, 함수에서 특정 인자만 주기 위해 사용할 수도 있습니다.
 */

fun color(red: Int, green: Int, blue: Int) = "($red $green $blue)"

fun main() {
    println(color(1, 2, 3))
    // 이름 붙은 인자 사용
    println(color(
        red = 1,
        green = 2,
        blue = 3
    ))
}
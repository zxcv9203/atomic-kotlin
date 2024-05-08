package chapter01.atom08

fun main() {
    val answer = 42
    // $를 사용하여 변수를 문자열에 포함시킬 수 있습니다.
    println("The answer is $answer")
    // $ 다음에 오는 대상이 프로그램 식별자로 인식되지 않으면 아무일도 일어나지 않습니다.
    println("print $1")

    // 문자열 연결을 통해 값을 넣을 수도 있습니다.
    println("The answer is " + answer)

    // $의 안에 식을 넣으면 그 식을 평가합니다.
    val condition = true
    println(if (condition) "right" else "wrong")
    println("The answer is ${answer + 1}")

    // String 안에 큰따옴표 등의 특수문자를 넣는 경우 역슬래시를 이용해 이스케이프 처리를 하거나
    // 큰 따옴표를 연달아 세 개 쓰는 String 리터럴을 사용해야 함
    val s = "value"
    println("The value is \"$s\"")
    println("""The value is "$s"""")
}
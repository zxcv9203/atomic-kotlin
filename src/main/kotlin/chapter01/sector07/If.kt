package chapter01.sector07

fun main() {
    if1()
    if2()
    if3()
    println(if4())
}

fun if1() {
    if (1 > 0)
        println("1은 0보다 크다")
    if (10 < 11) {
        println("10은 11보다 작다")
    }
}

// 다음과 같이 Boolean 타입의 변수를 선언하여 if문에 사용할 수 있습니다.
fun if2() {
    val x: Boolean = 1 >= 1
    if (x)
        println("1은 1보다 크거나 같다")
}

fun if3() {
    val n: Int = -11
    if (n > 0)
        println("양수")
    else if(n == 0)
        println("0")
    else
        println("음수")
}

// return을 쓰는 대신 else 키워드와 함께 결과를 만들 수 있습니다.
fun if4(): String = if (1 > 0) "1은 0보다 크다" else "1은 0보다 크지 않다"
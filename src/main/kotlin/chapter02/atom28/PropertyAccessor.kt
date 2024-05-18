package chapter02.atom28

/**
 * 프로퍼티 이름을 사용해 프로퍼티를 읽습니다.
 *
 * 대입 연산자 = 를 사용해 가변 프로퍼티에 값을 대입합니다.
 */

class Data(var i: Int) {
    /**
     * 프로퍼티 값을 얻기 위해 사용하는 접근자를 getter라고 부릅니다.
     * 프로퍼티 정의 바로 다음에 get()을 정의하면 게터를 정의할 수 있습니다.
     */
    val doubleI: Double
        get() = i.toDouble()

    /**
     * 가변 프로퍼티를 갱신하기 위해 사용하는 접근자는 세터라고 합니다.
     * 프로퍼티 정의 바로 다음에 set()을 정의하면 세터를 정의할 수 있습니다.
     */
    var n: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            }
        }

    // 프로퍼티를 private으로 정의하면 외부에서 접근할 수 없습니다.
    private var value: Int = 0
    fun inc() = value++

    // 다음과 같이 setter만 private으로 정의할 수 도 있습니다.
    var j: Int = 0
        private set
}

fun main() {
    val data = Data(10)
    data.i = 20
    val doubleI = data.doubleI
    println(doubleI)
}
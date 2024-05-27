package chapter03.atom34

/**
 * Enum Class는 모아둔 이름을 관리하는 편리한 방법입니다.
 *
 * enum을 만들면 enum에 이름에 해당하는 문자열을 돌려주는 toString()이 생성됩니다.
 */
enum class Level {
    Overflow,
    High,
    Medium,
    Low,
    Empty
}

/**
 * enum에 서로 다른 프로퍼티를 정의할 수 있습니다.
 */
enum class Direction(val noation: String) {
    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E");

    val opposite: Direction
        get() = when(this) {
            NORTH -> SOUTH
            SOUTH -> NORTH
            WEST -> EAST
            EAST -> WEST

}

fun main() {
    // enum을 사용해 enum 항목마다 서로 다른 동작을 수행할 수 있습니다.
    val level = Level.Medium
    when(level) {
        Level.Overflow -> println("Overflow")
        Level.High -> println("High")
        Level.Medium -> println("Medium")
        Level.Low -> println("Low")
        Level.Empty -> println("Empty")
    }
}
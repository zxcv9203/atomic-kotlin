package chapter04.atom47

/**
 * 함수 인자로 멤버 참조를 전달할 수 있습니다.
 *
 * 멤버 함수나 프로퍼티 이름 앞에 그들이 속한 클래스 이름과 2중 콜론을 위치시켜 멤버 참조를 만들 수 있습니다.
 */

data class Message(
    val sender: String,
    val text: String,
    val isRead: Boolean
)

fun ignore(message: Message) {
    println("Ignoring message: ${message.text}")
}
data class Student(
    val name: String
)
fun main() {
    val messages = listOf(
        Message("Kitty", "Hey!", true),
        Message("Kitty", "Are you there?", false),
    )

    val unread = messages.filterNot(Message::isRead)
    println(unread) // [Message(sender=Kitty, text=Are you there?, isRead=false)]

    // 최상위 수준 함수를 참조로 전달하는 경우 ::functionName 형태로 전달합니다.
    unread.forEach(::ignore)

    // 클래스 이름을 이용해 생성자에 대한 참조를 만들 수도 있습니다.
    val names = listOf("Alice", "Bob", "Charlie")
    val students = names.map(::Student)
    println(students) // [Student(name=Alice), Student(name=Bob), Student(name=Charlie)]
}
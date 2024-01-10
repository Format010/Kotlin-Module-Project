import java.util.Scanner
class NoteList(val note: Note, val scanner: Scanner) {
    fun show() {
        println("Заметка: ${note.title}")
        println("Текст: ${note.text}")
        println("Нажмите Enter, чтобы выйти.")
        scanner.nextLine()
    }
}


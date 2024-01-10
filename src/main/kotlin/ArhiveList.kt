import java.util.Scanner

class ArchiveList(val arhive: Archive, val scanner: Scanner) {
 val menu = Menu("Архив: ","заметку", arhive)
    fun show() {
        while (true){

        menu.menuList()

            when (val input = scanner.nextLine()) {
               "0" -> create()
               "1" -> return
                else -> {
                   val inT = input.toIntOrNull()?.minus(2)
                   if (inT != null && inT in arhive.notes.indices) {
                      NoteList(arhive.notes[inT], scanner).show()
                    } else {
                        println("Неверный ввод, попробуйте снова.")

                   }}}}}

    fun create() {
        var title = ""
        while (title.isBlank()) {
            print("Введите название заметки: ")
            title = scanner.nextLine()
            if (title.isBlank()) {
                println("Поле пустое, попробуйте еще раз.")
            }
        }

        var text = ""
        while (text.isBlank()) {
            print("Введите текст заметки: ")
            text = scanner.nextLine()
            if (text.isBlank()) {
                println("Поле пустое, повторите ввод.")
            }
        }

        val newNote = Note(title, text)
        arhive.notes.add(newNote)
        println("Заметка $title добавлена в архив ${arhive.name}.")
    }
}
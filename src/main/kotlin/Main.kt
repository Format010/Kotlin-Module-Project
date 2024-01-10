
class Archive(val name: String, val notes: MutableList<Note> = mutableListOf())
data class Note(val title: String, val text: String)

fun main(args: Array<String>) {

   MenuList(Archive("")).start()

}


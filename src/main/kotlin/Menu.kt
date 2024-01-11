open class Menu(val title: String, val nameMenu: String, val arhive: Archive) {

    var archiv2 = mutableListOf<Archive>()

    constructor(
        title: String,
        nameMenu: String,
        archive: Archive,
        archiv2: MutableList<Archive> = mutableListOf()
    ) : this(title, nameMenu, archive) {
        this.archiv2 = archiv2
    }

    open fun menuList() {
        var n: Int = 0
        println("\n++++ $title ${arhive.name} ++++\n")
        println("$n. Создать $nameMenu")
        println("${n + 1}. Выход")

        if (arhive.notes != null) {
            arhive.notes.forEach {
                n++
                val notesort = arhive.notes.joinToString() { "${it.title} -- ${it.text}" }
                println("${n + 1}. Архив: ${arhive.name}: Заметка: $notesort")
            }
        }
        if (archiv2 != null) {
            archiv2.forEachIndexed { index, archive ->
                println("${index + 2}. ${archive.name}")
            }
        }
        print("\nВведите номер: ")
    }
}

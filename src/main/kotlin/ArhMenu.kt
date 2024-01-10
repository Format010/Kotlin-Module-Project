import java.util.Scanner
class MenuList(arhive: Archive) {
    val scanner: Scanner = Scanner(System.`in`)
    val arhiv2 = mutableListOf<Archive>()
    val menu = Menu("Главное меню: ", "Архив", arhive, arhiv2)
    fun start() {
        while (true) {
            menu.menuList()

            when (val input = scanner.nextLine()) {
                "0" -> add()
                "1" -> break
                else -> {
                    val index = input.toIntOrNull()?.minus(2)
                    if (index != null && index in arhiv2.indices) {
                        ArchiveList(arhiv2[index], scanner).show()
                    } else println("Нет такого пункта в меню. Повторите ввод!")
                }}}}

    fun add() {
        var name = ""
        while (name.isBlank()) {
            print("Введите название архива: ")
            name = scanner.nextLine()
            if (name.isBlank()) {
                println("Введено пустое поле! Повторите ввод.")
            }
        }
        val addArh = Archive(name)
        arhiv2.add(addArh)
        println("Архив $name создан.\n")
    }
}
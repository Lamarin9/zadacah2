fun main (){
println("Введите текст в алфавитном порядке: " + zada2(readln()))}
fun zada2(string: String): String {
    val charco = mutableMapOf<Char, Int>()
    var rez = ""
    string.forEach { char ->
        charco[char] = charco.getOrDefault(char, 0) + 1
    }
    charco.toSortedMap().forEach { (char, count) ->
        rez += "$char - $count\n"
    }
    return rez
}



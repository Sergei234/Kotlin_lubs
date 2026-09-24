fun main(){
//task1
    val letter: Char = 'K'
    val word: String = "K"
    // Char is a single character in single quotes, String is a sequence of zero or more characters in double quotes
    println(letter)
    println(word)
    println(word[0])
    println(word[0] == letter)

//task2
    print("Enter line ")
    val line = readln()
    if (line.isNotEmpty()){
        println("first = ${line[0]}")
        println("last = ${line[line.length - 1]}")
    }else{
        println("Empty input")
    }

//task3
    print("Enter char: ")
    val ch = readln()[0]
    when (ch){
        in '0'..'9' -> println("Digit")
        in 'A'..'Z' -> println("Uppercase")
        in 'a'..'z' -> println("Lowercase")
        else -> println("Other")
    }

//task4
    print("Enter digit ")
    val ch_2 = readln()[0]
    val value = ch_2 - '0'
    println("value = $value")
    println(value * 2)

//task5
    print("Enter text: ")
    val text = readln()
    var letters = 0
    for (c in text){
        if (c.isLetter()){
            letters += 1
        }
    }
    println("Letters: $letters")

//task6
    print("Enter line ")
    val line_2 = readln()
    var result = ""
    for (c in line_2){
        if (c.isLetter()){
            result += c
        }
    }
    println(result)

//task7
    print("Enter char ")
    val ch_3 = readln()[0]
    println(ch_3.isDigit())
    println(ch_3.isLetter())
    println(ch_3.isWhitespace())
    println(ch_3.lowercaseChar())
    println(ch_3.uppercaseChar())

//challenge
    print("Enter letter ")
    val ch_4 = readln()[0]
    if (ch_4 in 'a'..'z'){
        val shifted = 'a' + (ch_4 - 'a' + 1) % 26
        println(shifted)
    }else{
        println(ch_4)
    }

}
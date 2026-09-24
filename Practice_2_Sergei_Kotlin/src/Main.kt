fun main(){
//task1
    print("Enter n: ")
    val numb = readln().toInt()
    println("Triple = ${3 * numb}")
    println("square = ${numb*numb}")
//task2
    print("Enter a: ")
    val a = readln().toInt()
    print("Enter b: ")
    val b = readln().toInt()
    println("quotient = ${a/b}\n remainder = ${b/a}\n quotient = ${a%b}\n exact = ${a/b.toDouble()}")

//task3
    print("Enter value of sec ")
    val sec = readln().toInt()
    val hours = sec / 3600
    val minutes = sec % 3600 / 60
    val seconds = sec % 3600 % 60
    println("$hours hours: $minutes minutes: $seconds seconds")

//task4
    var score = 0
    print("Enter score1: ")
    score += readln().toInt()
    print("Enter score2: ")
    score += readln().toInt()
    print("Enter score3: ")
    score += readln().toInt()
    println("score fin: $score")

//task5
    print("Enter temp in cels: ")
    val temp_cels = readln().toInt()
    println("C = $temp_cels ")
    val temp_far = temp_cels*9.0/5.0 + 32.0
    println("F = $temp_far")
    if (temp_far < 32){
        println("$temp_far is below freezing")
    }else{
        println("$temp_far is not below freezing")
    }

//task6
    val big_bro = 8_100_000_000L
    //val big_bro: Long = 8_100_000_000
    print("Enter smth pls: ")
    val smth_pls = readln().toInt()
    val sum = big_bro + smth_pls
    println("Base: $big_bro\n Extra: $smth_pls\n Total: $sum")
//int has only 32bits, it might be not enough for some big_dudes

//task7
    val small: Byte = 100
    val medium: Short = 20_000
    print("sm + med = ${small+medium}")
    //int
    //if
    //val small: Byte = 200
    //Kotlin: Initializer type mismatch: expected 'Byte', actual 'Int'.
}

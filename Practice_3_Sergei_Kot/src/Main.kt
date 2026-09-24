fun main(){
//task1
    print("Enter score ")
    val score = readln().toInt()
    if (score >= 50){
        println("Pass")
    }else{
        println("Fail")
    }

//task2
    print("enter temp ")
    val temp = readln().toInt()
    if (temp < 0){
        println("Freezing")
    }else if(temp < 15 ){
        println("cold")
    }else if ( temp < 25){
        println("Mild")
    }else if (temp >= 25){
        println("Warm")
    }else{
        println("Wrong")
    }

//task3
fun main() {
    val age = readln().toInt()
    val hasTicket = readln() == "yes"
    if (age >= 18) {
        if (hasTicket) {
            println("Enter")
            } else {
            println("Buy a ticket")
            }
        } else {
        println("Too young")
        }
     }

//task4
    print("Enter age ")
    val age_2 = readln().toInt()
    if (age_2 < 13 || age_2 > 65){
        println("Discount")
    }else{
        println("Regular")
    }

//task5

    val a = readln().toInt()
    val b = readln().toInt()
    val max = if (a > b) a else b
    println("max = $max")

//task6

    val score_2 = readln().toInt()
    val grade = when (score_2) {
        in 90..100-> "A"
        in 80..89-> "B"
        in 70..79-> "C"
        in 60..69-> "D"
        else-> "F"
        }
    println(grade)

//task7
    val n = readln().toInt()
    val label = when {
        n < 0 -> "negative"
        n == 0 -> "zero"
        n % 2 == 0 -> "positive even"
        else -> "positive odd"
    }
    println(label)

}

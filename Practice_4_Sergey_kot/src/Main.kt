fun main(){
//task1
    val nums = listOf(4, 8, 15, 16, 23)
    println("first = ${nums[0]}")
    println("last = ${nums[nums.size - 1]}")
    println("size = ${nums.size}")

//task2
    val items = mutableListOf("milk", "bread")
    print("Enter item ")
    items.add(readln())
    items[0] = "oat milk"
    println(items)
    println("size = ${items.size}")

//task3
    print("Enter n ")
    val n = readln().toInt()
    repeat(n){
        print("*")
    }
    println()

//task4
    print("Enter n ")
    var n_2 = readln().toInt()
    while (n_2 > 0){
        println(n_2)
        n_2 -= 1
    }
    println("Go!")

//task5
    val xs = listOf(2, 1, 7, 4)
    var sumA = 0
    for (x in xs){
        sumA += x
    }
    var sumB = 0
    for (i in 0 until xs.size){
        sumB += xs[i]
    }
    println("Sum A = $sumA")
    println("Sum B = $sumB")

//task6
    for (i in 1..5){
        print("$i ")
    }
    println()
    for (i in 5 downTo 1){
        print("$i ")
    }
    println()
    for (i in 0 until 3){
        print("$i ")
    }
    println()
    for (i in 1..9 step 2){
        print("$i ")
    }
    println()

//task7
    print("Enter age ")
    val age = readln().toInt()
    if (age in 13..19){
        println("Teen")
    }else{
        println("Not a teen")
    }

//task8
    var choice: String
    do {
        println("1) Hello  2) Quit")
        choice = readln()
        if (choice == "1"){
            println("Hello!")
        }else if (choice != "2"){
            println("Unknown")
        }
    } while (choice != "2")

//task9
    print("Enter numbers: ")
    val parts = readln().split(" ")
    var sum = 0
    for (p in parts){
        if (p.isNotEmpty()){
            sum += p.toInt()
        }
    }
    println("Sum = $sum")

//challenge
    print("Enter names: ")
    val names = readln().split(",")
    for (i in names.indices){
        println("$i: ${names[i].trim()}")
    }

}
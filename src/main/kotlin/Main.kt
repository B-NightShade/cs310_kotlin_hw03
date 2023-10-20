import java.lang.NumberFormatException

fun calcA(comp:Double, att:Double): Double{
    var a = ((comp/att)-0.3)*5
    if (a < 0){
        a = 0.0
    }else if(a > 2.375){
        a = 2.375
    }
    return a
}

fun calcB(yds:Double, att:Double): Double{
    var b = ((yds/att)-3)*0.25
    if (b < 0){
        b = 0.0
    }else if(b > 2.375){
        b = 2.375
    }
    return b
}

fun calcC(td:Double, att:Double): Double{
    var c = ((td/att))*20
    if (c < 0){
        c = 0.0
    }else if(c > 2.375){
        c = 2.375
    }
    return c
}

fun calcD(intr:Double, att:Double): Double{
    var d = 2.375 - ((intr/att)*25)
    if (d < 0){
        d = 0.0
    }else if(d > 2.375){
        d = 2.375
    }
    return d
}

fun calcPasserRating(a:Double, b:Double,c:Double, d:Double): Double{
    val passerRating = ((a+b+c+d)/6)*100
    return passerRating
}

fun readInput(variable: String): Double{
    print("Enter $variable: ")
    val input = readLine()!!.toDouble()
    return input
}

fun main(args: Array<String>) {
    print("Enter player's name: ")
    var name = readLine()!!
    name = name.trim()

    var attempts :Double = 0.0
    try {
        attempts = readInput("attempts")
    }catch(e: NumberFormatException){
        println("Invalid number entered")
        attempts = readInput("attempts")
    }

    var completions :Double = 0.0
    try {
        completions = readInput("completions")
    }catch(e: NumberFormatException){
        println("Invalid number entered")
        completions = readInput("completions")
    }

    var yards :Double = 0.0
    try {
        yards = readInput("yards")
    }catch(e: NumberFormatException){
        println("Invalid number entered")
        yards = readInput("yards")
    }

    var touchdowns :Double = 0.0
    try {
        touchdowns = readInput("touchdowns")
    }catch(e: NumberFormatException){
        println("Invalid number entered")
        touchdowns = readInput("touchdowns")
    }

    var interceptions :Double = 0.0
    try {
        interceptions = readInput("interceptions")
    }catch(e: NumberFormatException){
        println("Invalid number entered")
        interceptions = readInput("interceptions")
    }

    val a = calcA(completions, attempts)
    val b = calcB(yards, attempts)
    val c = calcC(touchdowns, attempts)
    val d = calcD(interceptions, attempts)

    val passerRating = calcPasserRating(a,b,c,d)
    print("$name's passser rating = ")
    println("%.1f".format(passerRating))
}
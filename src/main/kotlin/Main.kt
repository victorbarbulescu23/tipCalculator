import java.text.DecimalFormat

fun main() {
    val tax = 0.025
    var gross = 0.0
    var net = 0.0
    var tip = 0.175
    var breakout = 1

    do{
        print("Enter the value of your item. to finish adding items, press zero: ")
        breakout = readLine()!!.toInt()
        gross += breakout
        println()
    } while (breakout != 0)

    net = gross + (gross * tax)

    val twoDigits = DecimalFormat("$###,###.##")
    var final = twoDigits.format(net)

    println("Your total after tax is $final. We recommend a 17.5% tip for our dedicated employees. Would you like to add a tip?")
    print("Enter YES if you would like to enter a tip. Enter NO if you would not like to enter a tip:")
    if (readLine() == "YES"){
        print("What percent tip would you like to add?: ")
        tip = readLine()!!.toDouble()
        net += (net * (tip / 100))
        final = twoDigits.format(net)
        println("Your new total with tip and tax is $final. Have a great rest of your day!")
    } else {
        println()
        println("Your total with tax is $final. Enjoy the rest of your day!")
    }


}
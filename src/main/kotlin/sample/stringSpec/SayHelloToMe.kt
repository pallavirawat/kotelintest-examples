package sample.stringSpec

import kotlin.random.Random

fun sayHelloToMeWithPower(name: String): String{
    val percentage = Random.nextInt(100)
    val returnString = "Hi, $name, you are $percentage% ready for the kotlin!"
    println(returnString)
    return returnString
}

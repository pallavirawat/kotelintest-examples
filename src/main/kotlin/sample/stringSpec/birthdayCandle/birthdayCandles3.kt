package sample.stringSpec.birthdayCandle


//return custom wish telling me how many longest candles i blew

fun birthdayCakeCandles(ar: List<Int>, name: String): String {
    val longestCandles = ar.max()?.let {
            max -> ar.filter { it == max }
    }
    if (longestCandles.isNullOrEmpty()){
        throw Exception("i want candles on my birthday always!!!")
    }
    return "HBD $name, You blew ${longestCandles.size} candles!! Woohoo!!"
}
package sample.stringSpec.birthdayCandle


//return custom wish telling me how many longest candles i blew

fun allBirthdayCandlesWish(candles: List<Int>, name: String): String {
    val longestCandles = candles.max()?.let {
            max -> candles.filter { it == max }
    }
    if (longestCandles.isNullOrEmpty()){
        throw Exception("i want candles on my birthday always!!!")
    }
    return "HBD $name, You blew ${longestCandles.size} candles!! Woohoo!!"
}
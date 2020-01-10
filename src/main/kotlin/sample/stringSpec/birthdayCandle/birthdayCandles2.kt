package sample.stringSpec.birthdayCandle


//return custom wish with my name and telling me how long of a candle I blew

fun customWishingWithLongestCandle(candles: Array<Int>, name: String): String {
    val longestCandle = candles.max()
    return "Happy Birthday $name, Here is your blown candle $longestCandle!! Woohoo!!"
}

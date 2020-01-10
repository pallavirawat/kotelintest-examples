package sample.stringSpec.birthdayCandle


//throw an exception when no candles are passed

fun customWishingWithLongestCandleNoExcuseAllowed(candles: Array<Int>, name: String): String {
    if (candles.isNullOrEmpty()){
        throw Exception("i always want candles on my birthday!!!")
    }
    return "Happy Birthday $name, Here is your blown candle ${candles.max()}!! Woohoo!!"
}
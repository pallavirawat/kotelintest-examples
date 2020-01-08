package sample.stringSpec.birthdayCandle


//return custom wish with my name and telling me how long of a candle I blew

fun longestBirthdayCandleWish(candles: List<Int>, name: String): String {
    return "HBD $name, Here is your blown candle ${candles.max()}"
}
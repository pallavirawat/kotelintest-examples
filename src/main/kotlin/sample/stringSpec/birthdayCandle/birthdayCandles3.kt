package sample.stringSpec.birthdayCandle

// return the longest candle and
//throw an exception when no candles are passed

fun getLongestCandles(
    candles: Array<Int>,
    name: String
): String {
    if (candles.isNullOrEmpty()){
        throw Exception("i always want candles on my birthday!!!")
    }
    return "Happy Birthday $name," +
            " Here is your blown candle" +
            " ${candles.max()}!! Woohoo!!"
}

fun main(){
//    getLongestCandles(null, "hello")
}










// ======================================
//       .
//       X                   .
//      XXX                  X
//      _X_        .        XXX
//     |   |       X        _X_
//     |   |      XXX      |   |
//     |   |      _X_      |   |
//     |   |     |   |     |   |
//     |   |     |   |     |   |
//     |   |     |   |     |   |
//     |___|     |___|     |___|
// =======================================
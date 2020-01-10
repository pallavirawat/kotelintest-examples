package sample.stringSpec.birthdayCandle


//return the longest birthday candle
// 2, 5, 6, 4

fun longestBirthdayCandle(candles: Array<Int>): Int? {
    return candles.max()
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

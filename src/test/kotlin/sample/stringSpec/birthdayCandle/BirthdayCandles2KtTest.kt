package sample.stringSpec.random

import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.specs.StringSpec
import sample.stringSpec.birthdayCandle.customWishingWithLongestCandle

fun containPallavi() = object: Matcher<String> {
    override fun test(value: String): Result {
        return Result(value.contains("Pallavi"), "it is true", "it is false")
    }
}

class BirthdayCandles2KtTest : StringSpec() {

    init {
        "should include my name in the wishes"{
            val candles = arrayOf(1, 2, 3, 4)
            val name = "Pallavi"

            val wishesForPallavi = wishingWithLongestBirthdayCandle(candles, name)
            val wishesForNayanika = wishingWithLongestBirthdayCandle(candles, "nayanika")

            wishesForPallavi shouldContain "Pallavi"
            wishesForPallavi should containPallavi()
            wishesForNayanika shouldNot containPallavi()
        }

//        "should always include my name in the wishes"{
//            assertAll { candles: List<Int> , a:String, b :String->
//                longestBirthdayCandleWish(candles, "Pallavi") should containPallavi()
//            }
//        }
    }
}
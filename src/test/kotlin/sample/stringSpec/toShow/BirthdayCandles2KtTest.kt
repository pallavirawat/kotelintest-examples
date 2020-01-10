package sample.stringSpec.toShow

import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.specs.StringSpec
import sample.stringSpec.birthdayCandle.customWishingWithLongestCandle

class BirthdayCandles2KtTest : StringSpec({
    "should include my name in the wishes"{
        val candles = arrayOf(1, 2, 3)
        val name = "Pallavi"

        val customWIsh =
            customWishingWithLongestCandle(candles, name)
        val customWIshFOrNayanika =
            customWishingWithLongestCandle(candles, "Nayanika")

        customWIsh shouldContain name
//        customWIsh should containPallavi()
//        customWIshFOrNayanika shouldNot containPallavi()
    }
})

//fun containPallavi() = object: Matcher<String>{
//    override fun test(value: String): Result {
//        return  Result(
//            value.contains("Pallavi"),
//            "it did not had pallavi!!!",
//            "it should not contain pallavi"
//        )
//    }
//
//}

//class BirthdayCandles2KtTest : StringSpec() {
//
//    init {
//        "should include my name in the wishes"{
//            val candles = arrayOf(1, 2, 3, 4)
//            val name = "Pallavi"
//
//            val wishesForPallavi = wishingWithLongestBirthdayCandle(candles, name)
//            val wishesForNayanika = wishingWithLongestBirthdayCandle(candles, "nayanika")
//
//            wishesForPallavi shouldContain "Pallavi"
//            wishesForPallavi should containPallavi()
//            wishesForNayanika shouldNot containPallavi()
//        }
//
////        "should always include my name in the wishes"{
////            assertAll { candles: List<Int> , a:String, b :String->
////                longestBirthdayCandleWish(candles, "Pallavi") should containPallavi()
////            }
////        }
//    }
//}
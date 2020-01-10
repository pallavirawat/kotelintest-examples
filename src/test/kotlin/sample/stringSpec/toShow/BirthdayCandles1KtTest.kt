package sample.stringSpec.toShow

import io.kotlintest.properties.assertAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import sample.stringSpec.birthdayCandle.longestBirthdayCandle


class BirthdayCandles1KtTest: StringSpec({
    "should return the tallest candle"{
        //arrange/assign
        val candles = arrayOf(1, 2, 3, 4, 5, 6, 7)
        //ACT
        val longestBirthdayCandle = longestBirthdayCandle(candles)
        //assertion
        longestBirthdayCandle shouldBe 7
    }

    "should return the talles candle always"{
        assertAll { candles: Array<Int> ->
            longestBirthdayCandle(candles) shouldBe candles.max()
        }
    }
})

//
//class BirthdayCandles1KtTest : StringSpec() {
//
//    init {
//        "should return the tallest candle of all"{
//            //arrange
//            val candles = arrayOf(2, 3, 1, 4, 3, 52, 1, 1, 52)
//
//            //act
//            val longestBirthdayCandle =
//                longestBirthdayCandle(candles)
//
//            //assert
//            longestBirthdayCandle shouldBe 52
//        }
//
//        "should always return the tallest candle of all"{
//            assertAll { candles:Array<Int> ->
//                longestBirthdayCandle(candles) shouldBe candles.max()
//            }
//        }
//
//    }
//
//}
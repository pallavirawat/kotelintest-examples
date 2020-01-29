package sample.stringSpec.random

import io.kotlintest.properties.assertAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import sample.stringSpec.birthdayCandle.longestBirthdayCandle


class BirthdayCandles1KtTest: StringSpec({
    "should return the tallest candle"{
        //arrange/assign
        val candles = arrayOf(1, 2, 3, 4, 5, 6, 7)
        //ACT
        val longestBirthdayCandle = longestBirthdayCandle(candles.toList())
        //assertion
        longestBirthdayCandle shouldBe 7
    }

    "should return the talles candle always"{
        assertAll { candles: List<Int> ->
            longestBirthdayCandle(candles) shouldBe candles.max()
        }
    }
})

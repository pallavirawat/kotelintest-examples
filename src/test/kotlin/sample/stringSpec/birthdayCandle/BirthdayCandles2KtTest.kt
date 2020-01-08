package sample.stringSpec.birthdayCandle

import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.properties.assertAll
import io.kotlintest.should
import io.kotlintest.shouldNot
import io.kotlintest.specs.StringSpec

class BirthdayCandles2KtTest : StringSpec() {

    init {
        "should include my name in the wishes"{
            val candles = listOf(1, 2, 3, 4)
            val name = "Pallavi"

            val wishesForPallavi = longestBirthdayCandleWish(candles, name)
            val wishesForNayanika = longestBirthdayCandleWish(candles, "nayanika")

            wishesForPallavi shouldContain "Pallavi"
            wishesForPallavi should containPallavi()
            wishesForNayanika shouldNot containPallavi()
        }

        "should always include my name in the wishes"{
            assertAll { candles: List<Int> ->
                longestBirthdayCandleWish(candles, "Pallavi") should containPallavi()
            }
        }
    }
}
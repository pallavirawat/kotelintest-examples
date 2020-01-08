package sample.stringSpec.birthdayCandle

import io.kotlintest.properties.assertAll
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class BirthdayCandles1KtTest : StringSpec() {

    init {
        "should return the tallest candle of all"{
            //arrange
            val candles = listOf(2, 3, 1, 4, 3, 52, 1, 1, 52)

            //act
            val longestBirthdayCandle =
                longestBirthdayCandle(candles)

            //assert
            longestBirthdayCandle shouldBe 52
        }

        "should always return the tallest candle of all"{
            assertAll { a:List<Int> ->
                longestBirthdayCandle(a) shouldBe a.max()
            }
        }

    }

}
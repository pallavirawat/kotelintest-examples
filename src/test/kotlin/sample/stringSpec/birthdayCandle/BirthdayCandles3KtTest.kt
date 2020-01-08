package sample.stringSpec.birthdayCandle

import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow

class BirthdayCandles3KtTest : StringSpec() {

    init {
        "should throw exception when no candles are there on my birthday"{
            val exception = shouldThrow<Exception> {
                birthdayCakeCandles(listOf(), "Pallavi")
            }

            exception.message shouldBe "i want candles on my birthday always!!!"
        }
    }

}
package sample.stringSpec.random

import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldThrow
import io.kotlintest.tables.forAll
import io.kotlintest.tables.headers
import io.kotlintest.tables.row
import io.kotlintest.tables.table
import sample.stringSpec.birthdayCandle.getLongestCandles
import java.lang.Exception

class BirthdayCandles3KtTest : StringSpec() {
    override fun listeners(): List<TestListener> {
        return listOf(TimerListener)
    }

    init {
        "should throw exception when no candles are there on my birthday"{
            val exception = shouldThrow<Exception> {
                wishingWithLongestCandleNoExcuseAllowed(arrayOf(), "Pallavi")
            }

            exception.message shouldBe "i want candles on my birthday always!!!"
        }


        "should include Woohoo in every wish"{
            val birthdayGirls = table(
                headers("candles", "name"),
                row(arrayOf(1, 2, 3, 4, 5), "pallavi"),
                row(arrayOf(1, 2, 3, 4, 5), "nayanika")
            )
            forAll(birthdayGirls){ candles, name ->
                wishingWithLongestCandleNoExcuseAllowed(candles, name) should containExcitement()
            }
        }
    }
}

package sample.stringSpec.random

import io.kotlintest.extensions.TestListener
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldThrow
import io.kotlintest.tables.forAll
import io.kotlintest.tables.headers
import io.kotlintest.tables.row
import io.kotlintest.tables.table
import sample.TimerListener
import sample.stringSpec.birthdayCandle.getLongestCandles
import java.lang.Exception

class BirthdayCandles3KtTest : StringSpec() {
    override fun listeners(): List<TestListener> {
        return listOf(TimerListener)
    }

    init {
        "should throw exception when no candles are there on my birthday"{
            val exception = shouldThrow<Exception> {
                getLongestCandles(arrayOf(), "Pallavi")
            }

            exception.message shouldBe "i always want candles on my birthday!!!"
        }


        "should include Woohoo in every wish"{
            val birthdayGirls = table(
                headers("candles", "name"),
                row(arrayOf(1, 2, 3, 4, 5), "pallavi"),
                row(arrayOf(1, 2, 3, 4, 5), "nayanika")
            )
            forAll(birthdayGirls){ candles, name ->
                getLongestCandles(candles, name) should containExcitement()
            }
        }
    }
}

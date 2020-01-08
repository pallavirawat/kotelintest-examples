package sample.stringSpec.birthdayCandle

import io.kotlintest.matchers.haveLength
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.should
import io.kotlintest.specs.StringSpec
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.tables.forAll
import io.kotlintest.tables.headers
import io.kotlintest.tables.row
import io.kotlintest.tables.table

class BirthdayCandles3KtTest : StringSpec() {
//    override fun listeners(): List<TestListener> {
//        return listOf(TimerListener)
//    }

    init {
        "should throw exception when no candles are there on my birthday"{
            val exception = shouldThrow<Exception> {
                allBirthdayCandlesWish(listOf(), "Pallavi")
            }

            exception.message shouldBe "i want candles on my birthday always!!!"
        }

        "should add names"{
            "pallavi" shouldBe haveLength(7)
        }

        "should include Woohoo in every wish"{
            val birthdayGirls = table(
                headers("candles", "name"),
                row(listOf(1, 2, 3, 4, 5), "pallavi"),
                row(listOf(1, 2, 3, 4, 5), "nayanika")
            )
            forAll(birthdayGirls){ candles, name ->
                allBirthdayCandlesWish(candles, name) should containExcitement()
            }
        }
    }
}
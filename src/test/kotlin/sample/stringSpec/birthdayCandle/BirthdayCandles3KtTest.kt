package sample.stringSpec.birthdayCandle

import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec

class BirthdayCandles3KtTest : StringSpec({
    val candles = arrayOf(1,2,4)
    val name = "Pallavi"
    "should contain name in the wish"{
        //


        //
        val customWish = getLongestCandles(candles, name)

        //
        customWish shouldContain name

    }

    "should throw and exception when no candles are given"{
        val exception = shouldThrow<Exception> {
            getLongestCandles(arrayOf(), name)
        }

        exception.message shouldBe "i always want candles on my birthday!!!"
    }
})

class test : StringSpec(){
    init {
        "should test "{

        }
    }
}
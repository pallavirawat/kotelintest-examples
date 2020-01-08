package sample.stringSpec

import io.kotlintest.specs.StringSpec
import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.kotlintest.matchers.string.shouldContain
import io.kotlintest.shouldBe

class SayHelloToMeKtTest : StringSpec() {

    override fun beforeTest(testCase: TestCase) {
        println(testCase.name)
    }

    override fun afterTest(testCase: TestCase, result: TestResult) {
    }

    init {
        "should see "{
            val name = "pallavi"

            val sayHelloToMeWithPower = sayHelloToMeWithPower(name)

            sayHelloToMeWithPower shouldContain name

        }
    }

}
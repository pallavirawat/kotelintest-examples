package sample

import io.kotlintest.TestCase
import io.kotlintest.TestResult
import io.kotlintest.extensions.TestListener

object TimerListener : TestListener {

    var started = 0L

    override fun beforeTest(testCase: TestCase): Unit {
        started = System.currentTimeMillis()
    }

    override fun afterTest(testCase: TestCase, result: TestResult): Unit {
        println("Duration of ${testCase.description} = " + (System.currentTimeMillis() - started))
    }
}
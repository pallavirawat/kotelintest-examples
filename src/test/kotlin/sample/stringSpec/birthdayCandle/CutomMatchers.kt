package sample.stringSpec.birthdayCandle

import io.kotlintest.Matcher
import io.kotlintest.Result

fun containPallavi() = object : Matcher<String> {
    override fun test(value: String): Result {
        return Result(value.contains("Pallavi"),
            "string $value should contain pallavi always",
            "string $value shoudl not contain pallavi")
    }
}
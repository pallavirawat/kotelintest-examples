package sample.annotationSpec

import io.kotlintest.Matcher
import io.kotlintest.Result
import io.kotlintest.should
import io.kotlintest.specs.AnnotationSpec

class CustomMatcherTest : AnnotationSpec() {
    @Test
    fun `time to see how is our matcher`() {
        "foo and bar" should containFoo()
    }


    fun containFoo() = object : Matcher<String> {
        override fun test(value: String) =
            Result(
                value.contains("foo"),
                "String $value should include foo",
                "String $value should not include foo"
            )
    }

}
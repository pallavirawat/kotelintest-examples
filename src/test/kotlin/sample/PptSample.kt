package sample

import io.kotlintest.Matcher
import io.kotlintest.matchers.haveLength
import io.kotlintest.matchers.startWith
import io.kotlintest.properties.assertAll
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec
import io.kotlintest.tables.forAll
import io.kotlintest.tables.headers
import io.kotlintest.tables.row
import io.kotlintest.tables.table
import io.kotlintest.Result

class PptSample : AnnotationSpec() {

    @Test
    fun `length should return size of string hello as 5`() {
        "hello".length shouldBe 5
    }

    @Test
    fun `startsWith should test for a prefix`() {
        "world" should startWith("wor")
    }

    @Test
    fun `string size`() {
        assertAll { a: String, b: String ->
            (a + b) should haveLength(a.length + b.length)
        }

    }

    @Test
    fun `should add`(){
        val myTable = table(
            headers("a", "b", "result"),
            row(1, 2, 3),
            row(1, 1, 2)
        )

        forAll(myTable) { a, b, result ->
            a + b shouldBe result
        }
    }

    @Test
    fun `time to see how is our matcher`(){
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

package sample.annotationSpec

import io.kotlintest.matchers.haveLength
import io.kotlintest.matchers.startWith
import io.kotlintest.properties.assertAll
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec


class BasicAssertion : AnnotationSpec() {

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
        // system automatically generates the test data for you
        assertAll { a: String, b: String ->
            (a + b) should haveLength(a.length + b.length)
        }

    }

}

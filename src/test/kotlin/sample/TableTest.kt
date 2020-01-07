package sample

import io.kotlintest.matchers.numerics.shouldBeLessThan
import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec
import io.kotlintest.tables.*

class TableTest : AnnotationSpec() {
    @Test
    fun `should add`() {
        //data-driven-tests
        val myTable = table(
            headers("a", "b", "result"),
            row(1, 2, 3),
            row(1, 1, 7) //this row will fail
        )

        forAll(myTable) { a, b, result ->
            a + b shouldBe result
        }

        forNone(myTable) { a, b, result ->
            a + b shouldBeLessThan result
        }
    }
}
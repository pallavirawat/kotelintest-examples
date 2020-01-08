package sample.annotationSpec

import io.kotlintest.TestCaseOrder
import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class IntialTrialTest : AnnotationSpec(){
    override fun testCaseOrder() = TestCaseOrder.Random

    @BeforeEach
    fun beforeTest() {
        println("Before each test")
    }

    @Ignore
    @Test
    fun test(){
        //actual vs expected
        1 shouldBe 2
    }

    @Test
    fun `should combine firstname and lastname`(){
        "pallavi ta" shouldBe "pallavi ta"
    }
}
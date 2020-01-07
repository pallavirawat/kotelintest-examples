package sample

import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class NameFunctionTest : AnnotationSpec(){

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
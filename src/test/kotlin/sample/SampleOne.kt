package sample

import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec

class SampleOne : AnnotationSpec(){
    @BeforeEach
    fun beforeTest() {
        println("Before each test")
    }

    @Test
    fun test1() {
        println("running test 1")
        1 shouldBe 1
    }

    @Test
    fun test2() {
        println("running test 2")
        3 shouldBe 3
    }
}
package sample

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec


class StringSpecSample : StringSpec(){
    init {
        "length should return size of string hello as 5" {
            "hello".length shouldBe 5
        }

        "bstartsWith should test for a prefix" {
            "world" should startWith("wor")
        }

    }

}
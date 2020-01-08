package sample.stringSpec

import io.kotlintest.matchers.startWith
import io.kotlintest.properties.assertAll
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

internal class GiveMeFullNameKtTest: StringSpec({
    "should club firstname and lastname"{
        val firstName = "Pallavi"
        val lastName = "Rawat"

        val myFullName = giveMeMyFullName(firstName, lastName)

        myFullName shouldBe "Pallavi Rawat"
    }

    "should club string 1 and string 2 with a space"{
        assertAll { s1: String, s2: String ->
            giveMeMyFullName(s1, s2) shouldBe "$s1 $s2"

        }
    }

    "should start with the firstname passed"{
        val firstName = "Pallavi"
        val lastName = "Rawat"

        val myFullName = giveMeMyFullName(firstName, lastName)

        myFullName should startWith(firstName)
    }
})
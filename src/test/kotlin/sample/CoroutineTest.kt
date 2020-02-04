package sample

import io.kotlintest.shouldBe
import io.kotlintest.specs.AnnotationSpec
import kotlinx.coroutines.*
import kotlin.system.*

import io.kotlintest.specs.StringSpec

//class CoroutineTest : AnnotationSpec(){
//    @Test
//    suspend fun testIfUserIsReturned(){
//        val user = fetchUser("sam")
//        user.name shouldBe "sam"
//        user.id shouldBe 1
//    }
//}

class CoroutineTest : StringSpec({
    "should test correct user is being returned"{
        val user = fetchUser("sam")
        user.name shouldBe "sam"
        user.id shouldBe 1
    }

    "concurrent fetch users" {
        val user1 = async { fetchUser("sam") }
        val user2 = async { fetchUser("leo") }
        val (name1, id1) = user1.await()
        val (name2, id2) = user2.await()
        name1 shouldBe "sam"
        name2 shouldBe "leo"
    }
})
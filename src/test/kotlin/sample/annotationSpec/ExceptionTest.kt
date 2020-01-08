package sample.annotationSpec

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldThrow
import io.kotlintest.specs.AnnotationSpec

class ExceptionTest : AnnotationSpec(){
    @Test
    fun testexception(){
        val exception = shouldThrow<Exception> {
            // code in here that you expect to throw an IllegalAccessException
            throw Exception("some testing error occurred! Ooops!!!!")
        }
        exception.message should startWith("some testing")
    }
}
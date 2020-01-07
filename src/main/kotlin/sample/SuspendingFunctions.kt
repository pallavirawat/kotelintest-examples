package sample

import kotlinx.coroutines.delay

data class User(val name: String, val id:Int)

suspend fun fetchUser(name: String): User {
   delay(5000)
   return User(name, 1)
}
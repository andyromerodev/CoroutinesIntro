import kotlinx.coroutines.*

fun main() {

    println("Hola Andy")

    repeat(3) {
        GlobalScope.launch {
            println("Hi from ${Thread.currentThread()}")
        }
    }
}
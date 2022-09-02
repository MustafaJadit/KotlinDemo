import java.util.Hashtable

fun main() {

    lamdaDemo()
}

private fun lamdaDemo() {
    var lambda1: () -> Unit = {

    }

    var lambda2: (String) -> Unit = { myString ->
        {
            println("$myString")
        }

    }

    val lambda3: (s: String) -> Int = { g ->
        println("start")
        g.length

    }
}

fun anonymousDemo() {
    var myInterface1 = object : MyInterface1 {
        override fun fun1() {

        }
    }
}

interface MyInterface1 {
    fun fun1()


    companion object {
        private const val TAG = "Demo4"
    }
}
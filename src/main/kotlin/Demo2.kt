import java.awt.Button
import java.awt.Color
import java.awt.TextArea
import java.io.File
import java.util.function.Predicate
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

data class Test(val _id: String) {
    val id: String
        get() = if (!_id.isEmpty()) _id else "Is Empty"


}

class Test2(var id_: String) {
    val id: String
        get() = if (!id_.isEmpty()) id_ else "Is Empty"

}


private fun m101() {
    println(Test("a").id)
    println(Test2("a").id)
    println(Test("a").toString())
    println(Test2("a").toString())
//    a
//    a
//    Test(_id=a)
//    Test2@e580929
}

sealed class Animal {
    class Cat(val name: String) : Animal()
    class Dog(val name: String) : Animal()
    class Frog(val name: String) : Animal()


}


fun m103() {
    inlined { "result" }
    notInlined { "secondResult" }
}

inline fun inlined(getString: () -> String?) = println(getString())
fun notInlined(getString: () -> String?) = println(getString())

typealias ClickHandler = (Button, TextArea) -> Unit

fun m102() {
    fun isInstance(animal: Animal) {
        when (animal) {
            is Animal.Cat -> {
                println("This is a cat")
            }
            is Animal.Dog -> {
                println("This is a dog")
            }
            else -> {
                println("This is something else")
            }
        }
    }
    isInstance(Animal.Cat("tom"))
    println(Animal.Cat("tom") == Animal.Cat("tom"))
}

fun m104() {

    open class A(x: Int) {
        init {
            println(x)
        }

        open fun getName(): String {
            return ""
        }
    }

    class B(y: Int) : A(y) {
        override fun getName(): String {
            return super.getName() + "\tchild"
        }
    }
}


fun m105() {

    foo()
    println(Demo2InnerClass().javaClass)
//    class Demo2Kt$foo$adHoc$1
//    0class Demo2InnerClass
}


fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    println(adHoc.javaClass)
    print(adHoc.x + adHoc.y)
}

class Demo2InnerClass {

}


fun m106() {
    class C {
        private fun foo() = object {
            val x: String = "x"
        }

        fun publicFoo() = object {
            val x: String = "y"
        }

        fun bar() {
            val x1 = foo().also {
                println(it.x)
            }
            val x2 = publicFoo().apply {
                println(x)
            }

        }
    }

    C().bar()
}


typealias NodeSet = Set<Person>
typealias MyFileTable<K> = MutableMap<K, MutableList<File>>
typealias MyHandler = (Int, String, Any) -> Unit
typealias  MyPredicate<T> = (T) -> Boolean

fun m107() {

    fun foo(p: MyPredicate<Int>): Unit {
        p(31)
    }

    val f: (Int) -> Boolean = { it > 0 }
    println(foo(f))

    val p: MyPredicate<Int> = { it > 0 }
    println(listOf(1, -2).filter(p))

}


fun m108() {

    class Example {
        var p: String by MyDelegate()


        inner class MyDelegate : ReadWriteProperty<Example, String> {
            override fun getValue(thisRef: Example, property: KProperty<*>): String {
                return "$thisRef ,\t${thisRef.javaClass.name} \t${thisRef.javaClass.typeName} thank you for delegating ${property.name} to me"
            }

            override fun setValue(thisRef: Example, property: KProperty<*>, value: String) {
                println("$value has been assigned to ${property.name} in $thisRef")
            }

        }

        var p2: String by MyDelegate3()
    }

    val e = Example()
    println(e.p)
    e.p = "new String"


}

class MyDelegate3 : ReadWriteProperty<String, String> {

    override fun getValue(thisRef: String, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }

    override fun setValue(thisRef: String, property: KProperty<*>, value: String) {
        TODO("Not yet implemented")
    }

    operator fun getValue(any: Any, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }

    operator fun setValue(any: Any, property: KProperty<*>, s: String) {
        TODO("Not yet implemented")
    }

}


fun m109() {

    m109_1()
}

fun m109_1() {
    val b = BaseImpl(10)
    Derived(b).print()//10
    Derived(b).printMessage()//10 message
}

interface Base {
    fun print()
    fun printMessage()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }

    override fun printMessage() {
        println("\t$x message")
    }
}

class Derived(b: Base) : Base by b


fun m110() {
    m110_1()
}


fun m110_1() {
    val b = BaseImpl(10)
    Derived2(b).print()//MyDelegete2
    Derived2(b).printMessage()//
}

class Derived2(b: Base) : Base by MyDelegete2()

class MyDelegete2 : Base {
    override fun print() {
        println("MyDelegete2")
    }

    override fun printMessage() {

    }
}


fun m111() {
    m111_1()
}


fun m111_1() {
    val b = BaseImpl(10)
    Derived3(b).print()//abc
    Derived3(b).printMessage()//10 message
}

class Derived3(b: Base) : Base by b {
    override fun print() {
        print("abc")
    }
}


fun m112() {
    infix fun Int.shl2(x: Int): Int {
        println("infix fun with param $x , this is $this")
        return 43
    }
    1.shl2(3)

    2 shl2 6

}


private fun main() {
    m113()
}

fun m113() {
    printIfTypeMatch<String>("name")
}

inline fun <reified T> printIfTypeMatch(item: Any) {
    if (item is T) {
        println("item is T $item")
    }

}
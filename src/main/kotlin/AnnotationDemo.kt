fun main() {

}

@Foo("hardCodeClass")
class Bar {
    @Foo("hardCodeMethod")
    fun speak(@Foo("hardCodeParam") name: String): Int {
        return (@Foo("hardCodeReturn") 3)
    }
}

@Foo2
class Bar2 {

}


@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.EXPRESSION
)
@Retention(AnnotationRetention.SOURCE)
annotation class Foo(val expression: String) {

}

annotation class Foo2 {

}
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MutableListDemo1KtTest {

    @Test
    fun main() {
        var constructorDemo1 = ConstructorDemo1(12)
        assertEquals(constructorDemo1.height,12)
    }
}
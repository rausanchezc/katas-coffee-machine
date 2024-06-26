package order

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OrderTestShould {

    @ParameterizedTest
    @MethodSource("teaInputProvider")
    fun `order a tea`(sugar: Int, expected: String) {

        val result = OrderCommand("Tea", sugar).send()

        assertEquals(expected, result)
    }

    private fun teaInputProvider() = Stream.of(
            Arguments.of(1, "M:T:1:0"), // with 1 sugar and a stick
            Arguments.of(2, "M:T:2:0") // with 2 sugar and a stick
        )

    @ParameterizedTest
    @MethodSource("chocolateInputProvider")
    fun `order a chocolate`(sugar: Int, expected: String) {
        val result = OrderCommand("Chocolate", sugar).send()

        assertEquals(expected, result)
    }

    private fun chocolateInputProvider() = Stream.of(
            Arguments.of(0, "M:H::"), // with no sugar and without stick
            Arguments.of(1, "M:H:1:0") // with 1 sugar and a stick
        )


    @Test
    fun `order a coffee with 2 sugars and a stick`() {
        val result = OrderCommand("Coffee", 2).send()

        assertEquals("M:C:2:0", result)
    }
}

package order

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OrderTestShould {

    @Test
    fun `order a tea with 1 sugar and a stick`() {

        val result = OrderCommand("T:1:0").send()

        assertEquals("M:T:1:0", result)
    }

    @Test
    fun `order a chocolate with no sugar - and therefore no stick`() {
        val result = OrderCommand("H::").send()

        assertEquals("M:H::", result)
    }

    @Test
    fun `order a coffee with 2 sugars and a stick`() {
        val result = OrderCommand("C:2:0").send()

        assertEquals("M:C:2:0", result)
    }
}
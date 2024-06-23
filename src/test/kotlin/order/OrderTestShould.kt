package order

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OrderTestShould {

    @Test
    fun `order a tea with 1 sugar and a stick`() {

        val result = OrderCommand("T:1:0").send()
        assertEquals("M:T:1:0", result)
    }
}
package order

class OrderCommand(private val product: String, private val sugar: Int) {
    fun send(): String = when(product.lowercase()) {
            "coffee" -> "C:2:0"
            "tea" -> "T:1:0"
            "chocolate" -> "H::"
            else -> throw UnsupportedOperationException()
        }.also { return "M:$it" }

}
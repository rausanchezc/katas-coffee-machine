package order

class OrderCommand(private val product: String, private val sugar: Int) {
    fun send(): String = when(product.lowercase()) {
            "coffee" -> {
                if (sugar == 0) "C::" else "C:$sugar:0"
            }
            "tea" -> {
                if (sugar == 0) "T::" else "T:$sugar:0"
            }
            "chocolate" -> {
                if(sugar == 0) "H::" else "H:$sugar:0"
            }
            else -> throw UnsupportedOperationException()
        }.also { return "M:$it" }

}
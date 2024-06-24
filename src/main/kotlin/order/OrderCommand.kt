package order

class OrderCommand(private val command: String) {
    companion object {
        private val PRODUCTS = setOf("T", "C", "H")
    }

    fun send(): String {

        val chunks = command.split(":")

        val product = chunks.first()

        if (product !in PRODUCTS) throw UnsupportedOperationException("Unsupported product:$product")

        return "M:$command"
    }
}
package order

class OrderCommand( val command: String) {
    fun send() : String {
        return when(command) {
            "T:1:0" -> "M:T:1:0"
            "H::" -> "M:H::"
            else -> throw UnsupportedOperationException("Unsupported command: $command")
        }
    }
}
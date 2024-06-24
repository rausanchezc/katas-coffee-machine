package order

class OrderCommand(private val command: String) {
    fun send() : String {
        return when(command) {
            "T:1:0", "H::"-> "M:$command"
            else -> throw UnsupportedOperationException("Unsupported command: $command")
        }
    }
}
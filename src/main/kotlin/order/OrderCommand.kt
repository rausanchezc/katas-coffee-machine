package order

class OrderCommand( val command: String) {
    fun send() : String {
        return "M:T:1:0"
    }
}
package sirius.tinkoff.koshelok.exception

class WalletNotFoundException(private val walletId: Long) : RuntimeException() {
    override val message: String
        get() = "There is no wallet with id=$walletId"
}

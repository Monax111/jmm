package sirius.tinkoff.koshelok.exception

import java.lang.RuntimeException

class TransactionNotFoundException(private val transactionId: Long) : RuntimeException() {
    override val message: String
        get() = "There is no transaction with id=$transactionId"
}

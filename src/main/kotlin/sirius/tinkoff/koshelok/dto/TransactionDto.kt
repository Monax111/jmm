package sirius.tinkoff.koshelok.dto

data class TransactionDtoCreate(
    val name: String,
    val type: String,
    val date: Long // unix timestamp
)

data class TransactionDto(
    val id: Long,
    val name: String,
    val type: String,
    val date: Long // unix timestamp
)

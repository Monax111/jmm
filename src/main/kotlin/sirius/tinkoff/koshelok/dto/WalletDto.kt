package sirius.tinkoff.koshelok.dto

data class WalletDtoCreate(
    val name: String,
    val currencyId: Long
)

data class WalletDto(
    val id: Long,
    val name: String
)

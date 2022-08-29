package sirius.tinkoff.koshelok.converter

import sirius.tinkoff.koshelok.dto.WalletDto
import sirius.tinkoff.koshelok.dto.WalletDtoCreate
import sirius.tinkoff.koshelok.model.WalletEntity

fun WalletEntity.toDto(): WalletDto {
    return WalletDto(
        id = this.id!!,
        name = this.name
    )
}

fun WalletDtoCreate.toEntity(): WalletEntity {
    return WalletEntity(
        id = 0, // Здесь должен быть null, чтобы передавать его в бд и она сама будет назначать
        name = this.name,
    )
}

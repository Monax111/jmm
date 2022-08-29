package sirius.tinkoff.koshelok.converter

import sirius.tinkoff.koshelok.dto.TransactionDto
import sirius.tinkoff.koshelok.dto.TransactionDtoCreate
import sirius.tinkoff.koshelok.model.TransactionEntity

fun TransactionEntity.toDto(): TransactionDto = TransactionDto(
    id!!, "", "", 123L
)

fun TransactionDtoCreate.toEntity(): TransactionEntity = TransactionEntity(id = 0)

fun TransactionDto.toEntity(): TransactionEntity = TransactionEntity(id)

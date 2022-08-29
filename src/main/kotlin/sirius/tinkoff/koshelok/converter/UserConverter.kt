package sirius.tinkoff.koshelok.converter

import sirius.tinkoff.koshelok.dto.UserDto
import sirius.tinkoff.koshelok.dto.UserDtoCreate
import sirius.tinkoff.koshelok.model.UserEntity

fun UserEntity.toDto(): UserDto = UserDto(
    id = this.id!!,
    mail = this.mail
)

fun UserDtoCreate.toEntity(): UserEntity = UserEntity(
    id = null,
    mail = this.mail
)

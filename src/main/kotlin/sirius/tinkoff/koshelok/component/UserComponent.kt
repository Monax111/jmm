package sirius.tinkoff.koshelok.component

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*
import sirius.tinkoff.koshelok.converter.toDto
import sirius.tinkoff.koshelok.converter.toEntity
import sirius.tinkoff.koshelok.dto.UserDto
import sirius.tinkoff.koshelok.dto.UserDtoCreate
import sirius.tinkoff.koshelok.repository.UserRepository

@Component
class UserComponent(@Autowired private val userRepository: UserRepository) {
    fun getAll(): List<UserDto> = userRepository.findAll().map { it.toDto() }

    fun get(@PathVariable userId: Long): UserDto = userRepository.getReferenceById(userId).toDto()

    fun delete(@PathVariable userId: Long) = userRepository.deleteById(userId)

    fun save(@RequestBody userDtoCreate: UserDtoCreate): UserDto = userRepository.save(userDtoCreate.toEntity()).toDto()
}

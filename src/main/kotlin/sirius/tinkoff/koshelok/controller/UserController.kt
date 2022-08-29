package sirius.tinkoff.koshelok.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import sirius.tinkoff.koshelok.component.UserComponent
import sirius.tinkoff.koshelok.dto.UserDto
import sirius.tinkoff.koshelok.dto.UserDtoCreate

@RestController
@RequestMapping("/user")
class UserController(@Autowired private val userComponent: UserComponent) {
    @GetMapping
    fun getAll(): List<UserDto> = userComponent.getAll()

    @GetMapping("/{userId}")
    fun get(@PathVariable userId: Long): UserDto = userComponent.get(userId)

    @DeleteMapping("/{userId}")
    fun delete(@PathVariable userId: Long) = userComponent.delete(userId)

    @PostMapping
    fun save(@RequestBody userDtoCreate: UserDtoCreate): UserDto = userComponent.save(userDtoCreate)
}

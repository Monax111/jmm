package sirius.tinkoff.koshelok.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import sirius.tinkoff.koshelok.component.WalletComponent
import sirius.tinkoff.koshelok.dto.WalletDto
import sirius.tinkoff.koshelok.dto.WalletDtoCreate

@RestController
@RequestMapping("/wallet")
class WalletController(@Autowired val walletComponent: WalletComponent) {
    @GetMapping
    fun getAll(): List<WalletDto> = walletComponent.getAll()

    @DeleteMapping("/{walletId}")
    fun delete(@PathVariable walletId: Long) = walletComponent.delete(walletId)

    @PostMapping
    fun save(@RequestBody walletDtoCreate: WalletDtoCreate): WalletDto = walletComponent.save(walletDtoCreate)
}

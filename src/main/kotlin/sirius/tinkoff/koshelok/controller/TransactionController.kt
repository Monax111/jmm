package sirius.tinkoff.koshelok.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import sirius.tinkoff.koshelok.component.TransactionComponent
import sirius.tinkoff.koshelok.dto.TransactionDto
import sirius.tinkoff.koshelok.dto.TransactionDtoCreate

@RestController
@RequestMapping("wallet/{walletId}/transaction")
class TransactionController(@Autowired val transactionComponent: TransactionComponent) {
    @GetMapping
    fun getAll(@PathVariable walletId: Long): List<TransactionDto> = transactionComponent.getAll()

    @DeleteMapping("/{transactionId}")
    fun delete(@PathVariable walletId: Long, @PathVariable transactionId: Long) =
        transactionComponent.delete(walletId, transactionId)

    @PostMapping
    fun save(@PathVariable walletId: Long, @RequestBody transactionDtoCreate: TransactionDtoCreate): TransactionDto =
        transactionComponent.save(walletId, transactionDtoCreate)

    @PutMapping
    fun update(@PathVariable walletId: Long, @RequestBody transactionDto: TransactionDto): TransactionDto =
        transactionComponent.update(walletId, transactionDto)
}

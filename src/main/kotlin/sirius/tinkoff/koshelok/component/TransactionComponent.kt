package sirius.tinkoff.koshelok.component

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import sirius.tinkoff.koshelok.converter.toDto
import sirius.tinkoff.koshelok.converter.toEntity
import sirius.tinkoff.koshelok.dto.TransactionDto
import sirius.tinkoff.koshelok.dto.TransactionDtoCreate
import sirius.tinkoff.koshelok.repository.TransactionRepository

@Component
class TransactionComponent(@Autowired val transactionRepository: TransactionRepository) {
    fun getAll(): List<TransactionDto> = transactionRepository.findAll().map { it.toDto() }

    fun delete(walletId: Long, transactionId: Long) { transactionRepository.deleteById(transactionId) }

    fun save(walletId: Long, transactionDtoCreate: TransactionDtoCreate): TransactionDto =
        transactionRepository.save(transactionDtoCreate.toEntity()).toDto()

    fun update(walletId: Long, transactionDto: TransactionDto): TransactionDto =
        transactionRepository.save(transactionDto.toEntity()).toDto()
}

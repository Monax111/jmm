package sirius.tinkoff.koshelok.component

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import sirius.tinkoff.koshelok.converter.toDto
import sirius.tinkoff.koshelok.converter.toEntity
import sirius.tinkoff.koshelok.dto.WalletDtoCreate
import sirius.tinkoff.koshelok.repository.WalletRepository

@Component
class WalletComponent(@Autowired val walletRepository: WalletRepository) {
    fun getAll() = walletRepository.findAll().map { it.toDto() }

    fun get(walletId: Long) = walletRepository.getReferenceById(walletId).toDto()

    fun delete(walletId: Long) = walletRepository.deleteById(walletId)

    fun save(walletDtoCreate: WalletDtoCreate) =
        walletRepository.save(walletDtoCreate.toEntity()).toDto()
}

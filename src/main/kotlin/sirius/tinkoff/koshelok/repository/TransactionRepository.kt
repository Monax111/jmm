package sirius.tinkoff.koshelok.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sirius.tinkoff.koshelok.model.TransactionEntity

@Repository
interface TransactionRepository : JpaRepository<TransactionEntity, Long>

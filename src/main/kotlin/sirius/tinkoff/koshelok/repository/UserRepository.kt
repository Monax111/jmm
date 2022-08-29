package sirius.tinkoff.koshelok.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sirius.tinkoff.koshelok.model.UserEntity

@Repository
interface UserRepository : JpaRepository<UserEntity, Long>

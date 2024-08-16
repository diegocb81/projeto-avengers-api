package one.digitalinnovation.avengers.resource.avenger

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import one.digitalinnovation.avengers.domain.avenger.Avenger


@Entity
data class AvengerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @Column(nullable = false)
    val nick: String,
    @Column(nullable = false)
    val person: String,
    val description: String?,
    val history: String?
) {
    fun toAvenger() = Avenger(id, nick, person, description, history)
}

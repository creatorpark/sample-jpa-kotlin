package sample.jpa.b_entity_associations.b_many_to_one.bi

import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import sample.jpa.a_entiity.id.IncrementId

@Entity
class Team(
    var name: String
) : IncrementId() {

    @OneToMany(mappedBy = "team")
    var players: MutableSet<Player> = mutableSetOf()

    fun addPlayer(player: Player) {
        player.team = this
        players.add(player)
    }

    fun removePlayer(player: Player) {
//        player.team = null
        players.remove(player)
    }
}
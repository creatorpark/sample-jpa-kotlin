package sample.jpa.b_entity_associations.b_many_to_one

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import sample.jpa.a_entiity.id.TsId


@Entity
class Player(
    val name: String,
    val uniformNumber: Int,
    team: Team
) : TsId() {
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TEAM_ID", referencedColumnName = "ID")
    var team: Team = team
}



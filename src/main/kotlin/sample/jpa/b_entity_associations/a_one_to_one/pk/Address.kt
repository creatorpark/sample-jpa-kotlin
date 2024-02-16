package sample.jpa.b_entity_associations.a_one_to_one.pk

import jakarta.persistence.Entity
import sample.jpa.a_entiity.id.TsId

/**
 * https://vladmihalcea.com/change-one-to-one-primary-key-column-jpa-hibernate/
 */
@Entity
class Address(
    val name: String,
    val uniformNumber: Int,
    user: User
) : TsId() {

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "TEAM_ID", referencedColumnName = "ID")
//    var user: User = user
}



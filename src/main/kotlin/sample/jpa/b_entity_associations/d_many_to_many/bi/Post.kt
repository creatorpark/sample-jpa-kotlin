package sample.jpa.b_entity_associations.d_many_to_many.bi

import jakarta.persistence.Entity
import sample.jpa.a_entiity.id.TsId

@Entity
class Post(
    var title: String,
    var contents: String,
) : TsId() {

//    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL], mappedBy = "team")
//    var tagList: MutableSet<Tag> = mutableSetOf()
}
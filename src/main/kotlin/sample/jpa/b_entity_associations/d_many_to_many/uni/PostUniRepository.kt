package sample.jpa.b_entity_associations.d_many_to_many.uni

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostUniRepository : JpaRepository<PostUni, Long>

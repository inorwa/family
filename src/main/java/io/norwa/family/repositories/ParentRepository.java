package io.norwa.family.repositories;

import io.norwa.family.domain.Parent;
import io.norwa.family.domain.ParentPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository extends JpaRepository<Parent, ParentPK> {

}

package kz.dom.domkzbackendv2.repository.jpa.dict.housing;

import kz.dom.domkzbackendv2.model.jpa.dict.housing.JpaBalconyType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBalconyTypeRepository extends PagingAndSortingRepository<JpaBalconyType, Long> {
}

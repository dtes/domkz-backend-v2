package kz.dom.domkzbackendv2.repository.jpa.dict.housing;

import kz.dom.domkzbackendv2.model.jpa.dict.housing.JpaToiletType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaToiletTypeRepository extends PagingAndSortingRepository<JpaToiletType, Long> {
}

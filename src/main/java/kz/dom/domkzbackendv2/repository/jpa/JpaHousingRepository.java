package kz.dom.domkzbackendv2.repository.jpa;

import kz.dom.domkzbackendv2.model.jpa.JpaHousing;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaHousingRepository extends PagingAndSortingRepository<JpaHousing, Long> {
}

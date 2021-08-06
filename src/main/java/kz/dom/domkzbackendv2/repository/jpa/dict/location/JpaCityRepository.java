package kz.dom.domkzbackendv2.repository.jpa.dict.location;

import kz.dom.domkzbackendv2.model.jpa.dict.location.JpaCity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCityRepository extends PagingAndSortingRepository<JpaCity, Long> {
}

package kz.dom.domkzbackendv2.repository.jdbc.dict.location;

import kz.dom.domkzbackendv2.model.jdbc.dict.location.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends PagingAndSortingRepository<City, Integer> {
}

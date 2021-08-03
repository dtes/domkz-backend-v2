package kz.dom.domkzbackendv2.repository.jdbc.dict.location;

import kz.dom.domkzbackendv2.model.jdbc.dict.location.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}

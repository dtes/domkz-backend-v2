package kz.dom.domkzbackendv2.repository.jdbc.dict.location;

import kz.dom.domkzbackendv2.model.jdbc.dict.location.Region;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends PagingAndSortingRepository<Region, Long> {
}

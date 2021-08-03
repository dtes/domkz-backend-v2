package kz.dom.domkzbackendv2.repository.jdbc.dict.location;

import kz.dom.domkzbackendv2.model.jdbc.dict.location.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictRepository extends PagingAndSortingRepository<District, Long> {
    Page<District> findAllByCityId(long cityId, PageRequest paging);
}

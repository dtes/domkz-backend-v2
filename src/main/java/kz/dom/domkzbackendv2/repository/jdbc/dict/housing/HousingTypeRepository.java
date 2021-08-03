package kz.dom.domkzbackendv2.repository.jdbc.dict.housing;

import kz.dom.domkzbackendv2.model.jdbc.dict.housing.HousingType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingTypeRepository extends PagingAndSortingRepository<HousingType, Long> {
}

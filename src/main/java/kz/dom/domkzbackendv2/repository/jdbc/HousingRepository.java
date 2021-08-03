package kz.dom.domkzbackendv2.repository.jdbc;

import kz.dom.domkzbackendv2.model.jdbc.Housing;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingRepository extends PagingAndSortingRepository<Housing, Long> {
}

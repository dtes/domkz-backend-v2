package kz.dom.domkzbackendv2.repository.jpa.dict;

import kz.dom.domkzbackendv2.model.jpa.dict.JpaBuilder;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaBuilderRepository extends PagingAndSortingRepository<JpaBuilder, Long> {
}

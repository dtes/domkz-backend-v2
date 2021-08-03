package kz.dom.domkzbackendv2.repository.jdbc.dict.location;

import kz.dom.domkzbackendv2.model.jdbc.dict.location.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends PagingAndSortingRepository<Address, Long> {
    Page<Address> findAllByCityId(Long country, PageRequest paging);
}

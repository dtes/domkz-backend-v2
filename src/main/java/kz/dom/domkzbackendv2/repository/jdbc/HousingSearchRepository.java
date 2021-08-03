package kz.dom.domkzbackendv2.repository.jdbc;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jdbc.Housing;
import org.springframework.stereotype.Repository;

@Repository
public interface HousingSearchRepository extends org.springframework.data.repository.Repository<Housing, Long> {
    HousingSearchResultDTO search(HousingSearchFilterDTO filter);
}

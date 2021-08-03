package kz.dom.domkzbackendv2.repository.jpa;

import kz.dom.domkzbackendv2.dto.HousingSearchFilterDTO;
import kz.dom.domkzbackendv2.dto.HousingSearchResultDTO;
import kz.dom.domkzbackendv2.model.jpa.JpaHousing;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaHousingSearchRepository extends org.springframework.data.repository.Repository<JpaHousing, Long> {
    HousingSearchResultDTO search(HousingSearchFilterDTO filter);
}

package kz.dom.domkzbackendv2.dto;

import kz.dom.domkzbackendv2.model.jdbc.Housing;
import kz.dom.domkzbackendv2.model.jpa.JpaHousing;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
//@NoArgsConstructor
public class HousingSearchResultDTO {
    private List<Housing> data;
    private List<JpaHousing> jpaData;
}

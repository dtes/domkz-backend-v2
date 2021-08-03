package kz.dom.domkzbackendv2.dto;

import lombok.Builder;
import lombok.Data;

@Data()
@Builder
//@NoArgsConstructor
public class HousingSearchFilterDTO {
    private Long housingTypeId;
    private Long conditionId;
    private Long wallTypeId;
    private Long builderId;
    private Double priceFrom;
    private Double priceTo;
    private Double areaFrom;
    private Double areaTo;
    private Integer pageNum;
    private Integer pageSize;
}

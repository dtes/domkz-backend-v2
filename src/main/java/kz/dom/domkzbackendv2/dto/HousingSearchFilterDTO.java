package kz.dom.domkzbackendv2.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//@NoArgsConstructor
public class HousingSearchFilterDTO {
    private long housingTypeId;
    private long conditionId;
    private long wallTypeId;
    private long builderId;
    private double priceFrom;
    private double priceTo;
    private double areaFrom;
    private double areaTo;
    private int pageNum;
    private int pageSize;
}

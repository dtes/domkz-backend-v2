package kz.dom.domkzbackendv2.model;

import kz.dom.domkzbackendv2.model.jdbc.base.BaseModel;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("price_his")
public class PriceHistory extends BaseModel {
    private Double price;
    private Long housingId;
}

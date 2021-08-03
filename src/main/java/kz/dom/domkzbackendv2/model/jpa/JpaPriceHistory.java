package kz.dom.domkzbackendv2.model.jpa;

import kz.dom.domkzbackendv2.model.jpa.base.JpaBaseModel;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name ="price_his")
@Entity
public class JpaPriceHistory extends JpaBaseModel {
    @Column(name ="price")
    private Double price;
    @Column(name = "housing_id")
    private Long housingId;
}

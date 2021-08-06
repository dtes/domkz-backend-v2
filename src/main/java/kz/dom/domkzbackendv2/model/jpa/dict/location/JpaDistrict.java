package kz.dom.domkzbackendv2.model.jpa.dict.location;

import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangNamedModel;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString(callSuper = true)
@Table(name = "districts")
@Entity
@BatchSize(size = 200)
public class JpaDistrict extends JpaMultiLangNamedModel {
    @Column(name = "city_id")
    private Long cityId;
}

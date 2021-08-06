package kz.dom.domkzbackendv2.model.jpa.dict;

import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangNamedModel;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@ToString(callSuper = true)
@Table(name = "builders")
@Entity
public class JpaBuilder extends JpaMultiLangNamedModel {
    private String site;
    @Column(name = "found_date")
    private Date foundDate;
    private String feature;
    @Column(name = "feature_en")
    private String featureEn;
    @Column(name = "feature_kk")
    private String featureKk;
}

package kz.dom.domkzbackendv2.model.jpa.dict.housing;

import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangNamedModel;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString(callSuper = true)
@Table(name = "toilet_types")
@Entity
public class JpaToiletType extends JpaMultiLangNamedModel {
}

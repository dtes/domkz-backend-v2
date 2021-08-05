package kz.dom.domkzbackendv2.model.jpa.dict.housing;


import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangJpaNamedModelJpa;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString(callSuper = true)
@Table(name = "electricity_types")
@Entity
@BatchSize(size = 100)
public class JpaElectricityType extends JpaMultiLangJpaNamedModelJpa {
}

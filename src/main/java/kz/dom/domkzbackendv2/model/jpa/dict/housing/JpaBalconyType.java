package kz.dom.domkzbackendv2.model.jpa.dict.housing;


import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangJpaNamedModelJpa;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@ToString(callSuper = true)
@Table(name = "balcony_types")
@Entity()
public class JpaBalconyType extends JpaMultiLangJpaNamedModelJpa {
}

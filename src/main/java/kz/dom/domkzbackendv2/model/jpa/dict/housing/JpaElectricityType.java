package kz.dom.domkzbackendv2.model.jpa.dict.housing;


import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangJpaNamedModelJpa;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString(callSuper = true)
@Table("electricity_types")
public class JpaElectricityType extends JpaMultiLangJpaNamedModelJpa {
}
package kz.dom.domkzbackendv2.model.jpa.dict.location;

import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangJpaNamedModelJpa;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString(callSuper = true)
@Table("districts")
public class JpaDistrict extends JpaMultiLangJpaNamedModelJpa {
    private Long cityId;
}

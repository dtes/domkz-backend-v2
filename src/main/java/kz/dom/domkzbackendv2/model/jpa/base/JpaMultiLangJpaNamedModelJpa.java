package kz.dom.domkzbackendv2.model.jpa.base;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Data
@ToString(callSuper = true)
@MappedSuperclass
public class JpaMultiLangJpaNamedModelJpa extends JpaNamedModelJpa {
    private String nameKk;
    private String nameEn;
}

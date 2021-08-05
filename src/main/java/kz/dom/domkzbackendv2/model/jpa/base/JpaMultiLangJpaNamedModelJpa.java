package kz.dom.domkzbackendv2.model.jpa.base;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@Data
@ToString(callSuper = true)
@MappedSuperclass
public class JpaMultiLangJpaNamedModelJpa extends JpaNamedModelJpa {
    @Column(name = "name_kk")
    private String nameKk;
    @Column(name = "name_en")
    private String nameEn;
}

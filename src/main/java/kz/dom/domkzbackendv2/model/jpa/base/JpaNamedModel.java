package kz.dom.domkzbackendv2.model.jpa.base;

import lombok.Data;
import lombok.ToString;

import javax.persistence.MappedSuperclass;

@Data
@ToString(callSuper = true)
@MappedSuperclass
public class JpaNamedModel extends JpaBaseModel {
    private String name;
}

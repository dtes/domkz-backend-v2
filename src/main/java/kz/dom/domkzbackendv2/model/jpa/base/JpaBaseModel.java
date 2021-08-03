package kz.dom.domkzbackendv2.model.jpa.base;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public class JpaBaseModel implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}

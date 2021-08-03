package kz.dom.domkzbackendv2.model.jpa.base;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public class JpaBaseModel implements Serializable {
    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
}

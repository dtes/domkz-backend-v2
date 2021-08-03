package kz.dom.domkzbackendv2.model.jdbc.dict.location;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

//@Data
@Getter
@Setter
@ToString(callSuper = true)
@Table("cities")
public class City {
    @Id
    private Integer id;
    private String name;
    private String nameKk;
    private String nameEn;
    private Long countryId;
    private Long regionId;
}

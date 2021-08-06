package kz.dom.domkzbackendv2.model.jpa.dict.location;

import kz.dom.domkzbackendv2.model.jpa.base.JpaMultiLangNamedModel;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

@Data
@ToString(callSuper = true)
@Table(name = "cities")
@Entity
public class JpaCity extends JpaMultiLangNamedModel {
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "region_id")
    private Long regionId;

    @OneToMany(mappedBy = "cityId", fetch = FetchType.EAGER)
    @BatchSize(size = 200)
    private List<JpaDistrict> districts;
}

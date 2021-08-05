package kz.dom.domkzbackendv2.model.jpa;

import kz.dom.domkzbackendv2.model.jpa.base.JpaBaseModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString(exclude = "housing")
@Table(name ="price_his")
@Entity
public class JpaPriceHistory {
    @Id
    @SequenceGenerator(name = "price-his-seq-gen", sequenceName = "price_his_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "price-his-seq-gen", strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name ="price")
    private Double price;
//    @Column(name = "housing_id")
//    private Long housingId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="housing_id")
    private JpaHousing housing;
}

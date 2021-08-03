package kz.dom.domkzbackendv2.model.jpa;

import kz.dom.domkzbackendv2.model.jpa.base.JpaBaseModel;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Table(name = "housings")
@Entity
public class JpaHousing extends JpaBaseModel {
    private long id;
    @Column(name = "rbd_id")
    private Long rbdId;
    @Column(name = "res_complex_id")
    private Long resComplexId;
    @Column(name = "res_complexes_blocks_id")
    private Long resComplexesBlocksId;
    @Column(name = "layout_id")
    private Long layoutId;
    private Boolean redeveloped;
    @Column(name = "ceilingHeight")
    private Double ceilingHeight;
    @Column(name = "dtCreate")
    private Date dtCreate;
    @Column(name = "dtModerate")
    private Date dtModerate;
    @Column(name = "dtClose")
    private Date dtClose;
    @Column(name = "dtModify")
    private Date dtModify;
    @Column(name = "supplySource")
    private Long supplySource;
    private String email;
    @Column(name = "contactName")
    private String contactName;
    @Column(name = "roomCount")
    private Integer roomCount;
    @Column(name = "floorCount")
    private Integer floorCount;
    @Column(name = "bedroomCount")
    private Integer bedroomCount;
    @Column(name = "coordX")
    private String coordX;
    @Column(name = "coordY")
    private String coordY;
    private String geohash;
    private String num;
    @Column(name = "houseNum")
    private String houseNum;
    @Column(name = "entry_number")
    private String entryNumber;
    @Column(name = "total_price")
    private Double totalPrice;
    private Boolean sell;
    private Boolean corner;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "window_view_id")
    private Long windowViewId;
    @Column(name = "city_id")
    private Long cityId;
    @Column(name = "property_class_id")
    private Long propertyClassId;
    @Column(name = "furnished_id")
    private Long furnishedId;
    @Column(name = "floorNum")
    private Integer floorNum;
    @Column(name = "finishing_id")
    private Long finishingId;
    @Column(name = "district_id")
    private Long districtId;
    @Column(name = "floor_id")
    private Long floorId;
    @Column(name = "region_id")
    private Long regionId;
    @Column(name = "state_id")
    private Long stateId;
    @Column(name = "country_id")
    private Long countryId;
    @Column(name = "balcony_types_id")
    private Long balconyTypesId;
    @Column(name = "water_supply_type_id")
    private Long waterSupplyTypeId;
    @Column(name = "door_type_id")
    private Long doorTypeId;
    @Column(name = "housing_type_id")
    private Long housingTypeId;
    @Column(name = "sewage_type_id")
    private Long sewageTypeId;
    @Column(name = "window_type_id")
    private Long windowTypeId;
    @Column(name = "wall_id")
    private Long wallId;
    @Column(name = "electricity_type_id")
    private Long electricityTypeId;
    @Column(name = "toilet_type_id")
    private Long toiletTypeId;
    @Column(name = "heating_type_id")
    private Long heatingTypeId;
    @Column(name = "price_per_square_meter")
    private Double pricePerSquareMeter;
    @Column(name = "isStudio")
    private Boolean isStudio;
    private Double area;
    @Column(name = "areaLive")
    private Double areaLive;
    @Column(name = "areaKitchen")
    private Double areaKitchen;
    @Column(name = "areaLand")
    private Double areaLand;

    // references
    @OneToMany(mappedBy = "housingId", fetch = FetchType.EAGER)
    @BatchSize(size = 10)
    private List<JpaPriceHistory> priceHistories;
}
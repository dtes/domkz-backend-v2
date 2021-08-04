package kz.dom.domkzbackendv2.model.jdbc;

import kz.dom.domkzbackendv2.model.jdbc.base.BaseModel;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
@Table("housings")
public class Housing extends BaseModel {
    private Long rbdId;
    private Long resComplexId;
    private Long resComplexesBlocksId;
    private Long layoutId;
    private Boolean redeveloped;
    @Column("ceilingHeight")
    private Double ceilingHeight;
    @Column("dtCreate")
    private Date dtCreate;
    @Column("dtModerate")
    private Date dtModerate;
    @Column("dtClose")
    private Date dtClose;
    @Column("dtModify")
    private Date dtModify;
    @Column("supplySource")
    private Long supplySource;
    private String email;
    @Column("contactName")
    private String contactName;
    @Column("roomCount")
    private Integer roomCount;
    @Column("floorCount")
    private Integer floorCount;
    @Column("bedroomCount")
    private Integer bedroomCount;
    @Column("coordX")
    private String coordX;
    @Column("coordY")
    private String coordY;
    private String geohash;
    private String num;
    @Column("houseNum")
    private String houseNum;
    private String entryNumber;
    private Double totalPrice;
    private Boolean sell;
    private Boolean corner;
    private Long addressId;
    private Long windowViewId;
    private Long cityId;
    private Long propertyClassId;
    private Long furnishedId;
    @Column("floorNum")
    private Integer floorNum;
    private Long finishingId;
    private Long districtId;
    private Long floorId;
    private Long regionId;
    private Long stateId;
    private Long countryId;
    private Long balconyTypesId;
    private Long waterSupplyTypeId;
    private Long doorTypeId;
    private Long housingTypeId;
    private Long sewageTypeId;
    private Long windowTypeId;
    private Long wallId;
    private Long electricityTypeId;
    private Long toiletTypeId;
    private Long heatingTypeId;
    private Double pricePerSquareMeter;
    @Column("isStudio")
    private Boolean isStudio;
    private Double area;
    @Column("areaLive")
    private Double areaLive;
    @Column("areaKitchen")
    private Double areaKitchen;
    @Column("areaLand")
    private Double areaLand;

    @MappedCollection(idColumn = "housing_id", keyColumn = "id")
    List<PriceHistory> priceHistories;
}

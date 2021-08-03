package kz.dom.domkzbackendv2.model.jdbc;

import kz.dom.domkzbackendv2.model.jdbc.base.BaseModel;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Table("housings")
public class Housing extends BaseModel {
    private Long rbdId;
    private Long resComplexId;
    private Long resComplexesBlocksId;
    private Long layoutId;
    private Boolean redeveloped;
    @Column("ceilingheight")
    private Double ceilingHeight;
    @Column("dtcreate")
    private Date dtCreate;
    @Column("dtmoderate")
    private Date dtModerate;
    @Column("dtclose")
    private Date dtClose;
    @Column("dtmodify")
    private Date dtModify;
    @Column("supplysource")
    private Long supplySource;
    private String email;
    @Column("contactname")
    private String contactName;
    @Column("roomcount")
    private Integer roomCount;
    @Column("floorcount")
    private Integer floorCount;
    @Column("bedroomcount")
    private Integer bedroomCount;
    @Column("coordx")
    private String coordX;
    @Column("coordy")
    private String coordY;
    private String geohash;
    private String num;
    @Column("housenum")
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
    @Column("floornum")
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
    @Column("isstudio")
    private Boolean isStudio;
    private Double area;
    @Column("arealive")
    private Double areaLive;
    @Column("areakitchen")
    private Double areaKitchen;
    @Column("arealand")
    private Double areaLand;
}

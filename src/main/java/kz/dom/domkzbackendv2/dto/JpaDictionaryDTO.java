package kz.dom.domkzbackendv2.dto;

import kz.dom.domkzbackendv2.model.jpa.dict.JpaBuilder;
import kz.dom.domkzbackendv2.model.jpa.dict.housing.*;
import kz.dom.domkzbackendv2.model.jpa.dict.location.JpaCity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JpaDictionaryDTO {
    Iterable<JpaCity> cities;
    Iterable<JpaBalconyType> balconyTypes;
    //AreaTypes
    Iterable<JpaCondition> conditions;
    //Finishing
    //FloorType
    //Furnished
    Iterable<JpaHeatingType> heatingTypes;
    Iterable<JpaHousingType> housingTypes;
    //HousingSort
    Iterable<JpaPropertyClass> propertyClasses;
    //ResComplex_classes
    //ResTypes
    Iterable<JpaToiletType> toiletTypes;
    Iterable<JpaWallType> wallTypes;
    //WaterSupplyType
    //WindowViews
    //Parking
    Iterable<JpaBuilder> builders;
    //CeilingHeight
    //Security
    //Outdoor
}

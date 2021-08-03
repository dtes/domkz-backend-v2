package kz.dom.domkzbackendv2.model.jdbc.dict.housing;


import kz.dom.domkzbackendv2.model.jdbc.base.MultiLangNamedModel;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString(callSuper = true)
@Table("electricity_types")
public class ElectricityType extends MultiLangNamedModel {
}

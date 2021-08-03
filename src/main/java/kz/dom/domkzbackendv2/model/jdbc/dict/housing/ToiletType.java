package kz.dom.domkzbackendv2.model.jdbc.dict.housing;

import kz.dom.domkzbackendv2.model.jdbc.base.MultiLangNamedModel;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString(callSuper = true)
@Table("toilet_types")
public class ToiletType extends MultiLangNamedModel {
}

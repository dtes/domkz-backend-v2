package kz.dom.domkzbackendv2.model.jdbc.dict.location;

import kz.dom.domkzbackendv2.model.jdbc.base.MultiLangNamedModel;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString(callSuper = true)
@Table("countries")
public class Country extends MultiLangNamedModel {
}

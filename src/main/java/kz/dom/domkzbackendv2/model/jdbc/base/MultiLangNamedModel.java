package kz.dom.domkzbackendv2.model.jdbc.base;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class MultiLangNamedModel extends NamedModel {
    private String nameKk;
    private String nameEn;
}

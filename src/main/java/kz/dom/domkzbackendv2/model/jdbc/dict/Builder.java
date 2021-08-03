package kz.dom.domkzbackendv2.model.jdbc.dict;

import kz.dom.domkzbackendv2.model.jdbc.base.MultiLangNamedModel;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@ToString(callSuper = true)
@Table("builders")
public class Builder extends MultiLangNamedModel {
    private String site;
    private Date foundDate;
    private String feature;
    private String featureEn;
    private String featureKk;
}

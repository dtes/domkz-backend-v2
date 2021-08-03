package kz.dom.domkzbackendv2.model.jdbc.base;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class NamedModel extends BaseModel {
    private String name;
}

package kz.dom.domkzbackendv2.model.jdbc.base;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Persistent;

@Data
public class BaseModel {
    @Id()
    private long id;
}

package proyecto.api_proyecto.feature.provincia;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("provincia")
public class Provincia {
    
    @Id
    @Column("id")
    private long provinciaId;
    @Column("provincia")
    private String provinciaa;

}

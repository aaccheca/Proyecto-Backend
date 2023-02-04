package proyecto.api_proyecto.feature.parroquia;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("parroquia")
public class Parroquia {
    
    @Id
    @Column("id")
    private long parroquiaId;
    @Column("parroquia")
    private String parroquiaa;

}

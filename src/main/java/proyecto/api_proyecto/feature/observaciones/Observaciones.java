package proyecto.api_proyecto.feature.observaciones;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("observaciones")
public class Observaciones {
    
    @Id
    @Column("id")
    private long observacionesId;
    @Column("estado")
    private String estado;
    @Column("observaciones")
    private String observacioness;

}

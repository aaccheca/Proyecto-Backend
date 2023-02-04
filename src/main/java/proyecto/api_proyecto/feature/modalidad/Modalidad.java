package proyecto.api_proyecto.feature.modalidad;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("modalidad")
public class Modalidad {
    
    @Id
    @Column("id")
    private long modalidadId;
    @Column("nombre")
    private String modalidadd;

}

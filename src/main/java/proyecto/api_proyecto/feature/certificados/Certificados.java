package proyecto.api_proyecto.feature.certificados;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("certificados")
public class Certificados {
    @Id
    @Column("id")
    private long certificadosId;
    @Column("solicitudes")
    private String solicitudes;
    @Column("portafolio")
    private String portafolio;
}

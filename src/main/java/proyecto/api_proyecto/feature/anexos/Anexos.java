package proyecto.api_proyecto.feature.anexos;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("anexos")
public class Anexos {
    
    @Id
    @Column("id")
    private long anexosId;
    @Column("anexos_empresariales")
    private String anexose;
    @Column("anexos_institucionales")
    private String anexosi;

}

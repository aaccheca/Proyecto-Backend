package proyecto.api_proyecto.feature.documentos;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("documentos")
public class Documentos {
    
    @Id
    @Column("id")
    private long documentosId;
    @Column("documentos_adjuntos")
    private String documentosA;

}

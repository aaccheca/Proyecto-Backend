package proyecto.api_proyecto.feature.entidad_receptora;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("entidad_receptora")
public class EntidadReceptora {
    
    @Id
    @Column("id")
    private long entidadReceptoraId;
    @Column("nombre")
    private String entidadReceptoraa;

}

package proyecto.api_proyecto.feature.carreras;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("carreras")
public class Carreras {
    
    @Id
    @Column("id")
    private long carrerasId;
    @Column("nombre")
    private String carrerass;

}

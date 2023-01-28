package proyecto.api_proyecto.feature.bibliografia;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("bibliografia")
public class Bibliografia {
    
    @Id
    @Column("id")
    private long bibliografiaId;
    @Column("num_estrategia")
    private String numEstrategia;
    @Column("estrategias_estrategia")
    private String estrategias;
    @Column("num_bibliografia")
    private String numBibliografia;
    @Column("bibliografias_bibliografia")
    private String bibliografias;

}

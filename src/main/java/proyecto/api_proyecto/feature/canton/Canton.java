package proyecto.api_proyecto.feature.canton;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("canton")
public class Canton {
    
    @Id
    @Column("id")
    private long cantonId;
    @Column("canton")
    private String cantonn;

}

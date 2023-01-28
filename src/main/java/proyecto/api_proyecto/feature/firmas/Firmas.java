package proyecto.api_proyecto.feature.firmas;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("firmas")
public class Firmas {
    
    @Id
    @Column("id")
    private long firmasId;
    @Column("numero")
    private String numero;
    @Column("cargo")
    private String cargo;
    @Column("nombre")
    private String nombre;
    @Column("cedula")
    private String cedula;

}

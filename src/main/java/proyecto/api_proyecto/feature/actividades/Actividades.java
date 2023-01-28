package proyecto.api_proyecto.feature.actividades;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("actividades")
public class Actividades {
    
    @Id
    @Column("id")
    private long actividadesId;
    @Column("frecuencia")
    private String frecuencia;
    @Column("sectores")
    private String sectores;
    @Column("vinculacion")
    private String vinculacion;
    @Column("ejes")
    private String ejes;
    
}

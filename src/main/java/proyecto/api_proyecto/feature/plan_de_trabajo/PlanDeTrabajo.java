package proyecto.api_proyecto.feature.plan_de_trabajo;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("plan_de_trabajo")
public class PlanDeTrabajo {
    
    @Id
    @Column("id")
    private long planTrabajoId;
    @Column("descripcion_general")
    private String descripcionGe;
    @Column("objetivo_proyecto")
    private String objetivoPro;
    @Column("analisis_situacional")
    private String analisisSi;
    @Column("justificacion")
    private String justificacion;
    @Column("num_objetivos")
    private String numObjetivos;
    @Column("nombre_objetivos")
    private String nombreOb;
    @Column("objetivo_objetivos")
    private String objetivoOb;
    @Column("indicador_objetivos")
    private String indicadorOb;
    @Column("metodos_objetivos")
    private String metodosOb;
    @Column("num_criterios")
    private String numCriterios;
    @Column("nombre_criterios")
    private String nombreCriterios;
    @Column("criterio_criterios")
    private String criterioCriterios;
    @Column("objetivos_especificos")
    private String objetivosEs;
    @Column("indicadores_verificables")
    private String indicadoresVe;
    @Column("medios_verificacion")
    private String mediosVe;
    @Column("conclusiones")
    private String conclusiones;
    @Column("recomendaciones")
    private String recomendaciones;

}

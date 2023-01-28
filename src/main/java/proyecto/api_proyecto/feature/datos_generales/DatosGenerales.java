package proyecto.api_proyecto.feature.datos_generales;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("datos_generales")
public class DatosGenerales {
    
    @Id
    @Column("id")
    private long dgId;
    @Column("codigo_proyecto")
    private long codigo;
    @Column("nombre_proyecto")
    private String nombrep;
    @Column("nombre_instituto")
    private String nombrei;
    @Column("ciclo")
    private String ciclo;
    @Column("cobertura_localizacion")
    private String cobertura;
    @Column("id_carrera")
    private long carreraId;
    @Column("id_modalidad")
    private long modalidadId;
    @Column("fecha")
    private String fecha;
    @Column("plazo_ejecucion")
    private String plazo;
    @Column("financiamiento")
    private String financiamiento;
    @Column("vigencia_convenio")
    private String vigencia;
    @Column("fecha_presentacion")
    private String fechaPresentacion;
    @Column("fecha_inicio")
    private String fechaInicio;
    @Column("fecha_final")
    private String fechaFinal;

}

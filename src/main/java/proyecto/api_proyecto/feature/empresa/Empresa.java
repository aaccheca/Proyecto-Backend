package proyecto.api_proyecto.feature.empresa;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("empresa")
public class Empresa {
    
    @Id
    @Column("id")
    private long empresaId;
    @Column("nombre_entidad")
    private String nombreE;
    @Column("id_entidad_receptora")
    private long entidadId;
    @Column("persona_autorizada_convenio")
    private String personaAc;
    @Column("numero_ruc")
    private String numRuc;
    @Column("actividad_economica")
    private String actividadEc;
    @Column("correo_empresa")
    private String correoE;
    @Column("telf_contacto")
    private String telfCo;
    @Column("parroquia_matriz")
    private long parroquiaMa;
    @Column("provincia_matriz")
    private long provinciaMa;
    @Column("canton_matriz")
    private long cantonMa;
    @Column("direccion_matriz")
    private String direccionMa;
    @Column("parroquia_sucursal")
    private long parroquiaSu;
    @Column("provincia_sucursal")
    private long provinciaSu;
    @Column("canton_sucursal")
    private long cantonSu;
    @Column("direccion_sucursal")
    private String direccionSu;
    @Column("numero_estudiantes_entidad")
    private String numEE;
    @Column("total_estudiantes_entidad")
    private String totalEE;
    @Column("lugar_ubicacion")
    private String lugarU;
    @Column("beneficiarios_directos")
    private String beneficiariosDi;
    @Column("beneficiarios_indirectos")
    private String beneficiariosIndi;

    @MappedCollection(idColumn = "id")
    private Set<EmpresaEntidadReceptora> entidadReceptora = new HashSet<>();

    @MappedCollection(idColumn = "id")
    private Set<EmpresaParroquia> parroquia = new HashSet<>();
    
    @MappedCollection(idColumn = "id")
    private Set<EmpresaProvincia> provincia = new HashSet<>();

    @MappedCollection(idColumn = "id")
    private Set<EmpresaCanton> canton = new HashSet<>();

}

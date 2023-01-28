package proyecto.api_proyecto.feature.integrantes;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Data;

@Data
@Table("integrantes")
public class Integrantes {

    @Id
    @Column("id")
    private long integrantesId;
    @Column("num_proyecto")
    private String numProyecto;
    @Column("nombre_proyecto")
    private String nombreProyecto;
    @Column("horario_proyecto")
    private String horarioProyecto;
    @Column("cargo_proyecto")
    private String cargoProyecto;
    @Column("funciones_proyecto")
    private String funcionesProyecto;
    @Column("num_estudiantes")
    private String numEstudiantes;
    @Column("nombre_estudiantes")
    private String nombreEstudiantes;
    @Column("cedula_estudiantes")
    private String cedulaEstudiantes;
    @Column("especialidad_estudiantes")
    private String especialidadEstudiantes;
    @Column("funciones_estudiantes")
    private String funcionesEstudiantes;
    @Column("num_docente")
    private String numDocente;
    @Column("nombre_docente")
    private String nombreDocente;
    @Column("horario_docente")
    private String horarioDocente;
    @Column("funciones_docente")
    private String funcionesDocente;
    @Column("num_institucion")
    private String numInstitucion;
    @Column("nombre_institucion")
    private String nombreInstitucion;
    @Column("cargo_institucion")
    private String cargoInstitucion;
    @Column("funciones_institucion")
    private String funcionesInstitucion;
    @Column("num_empresarial")
    private String numEmpresarial;
    @Column("nombre_empresarial")
    private String nombreEmpresarial;
    @Column("telf_empresarial")
    private String telfEmpresarial;
    @Column("cargo_empresarial")
    private String cargoEmpresarial;

}

package proyecto.api_proyecto.feature.datos_generales;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import proyecto.api_proyecto.feature.actividades.Actividades;
import proyecto.api_proyecto.feature.actividades.ActividadesService;
import proyecto.api_proyecto.feature.bibliografia.Bibliografia;
import proyecto.api_proyecto.feature.bibliografia.BibliografiaService;
import proyecto.api_proyecto.feature.empresa.Empresa;
import proyecto.api_proyecto.feature.empresa.EmpresaService;
import proyecto.api_proyecto.feature.firmas.Firmas;
import proyecto.api_proyecto.feature.firmas.FirmasService;
import proyecto.api_proyecto.feature.integrantes.Integrantes;
import proyecto.api_proyecto.feature.integrantes.IntegrantesService;
import proyecto.api_proyecto.feature.plan_de_trabajo.PlanDeTrabajo;
import proyecto.api_proyecto.feature.plan_de_trabajo.PlanDeTrabajoService;

@Service
public class DatosGeneralesService {
    
    @Autowired
    DatosGeneralesRepository datosGeneralesRepository;
    @Autowired
    private IntegrantesService service;
    @Autowired
    private EmpresaService empresaService;
    @Autowired
    private ActividadesService actividadesService;
    @Autowired
    private PlanDeTrabajoService planDeTrabajoService;
    @Autowired
    private BibliografiaService bibliografiaService;
    @Autowired
    private FirmasService firmasService;


    //CRUD = Create, Read, Update, Delete

    public DatosGenerales save(DatosGenerales datosGenerales){
        return datosGeneralesRepository.save(datosGenerales);
    }

    public DatosGenerales findById(long id){
        return datosGeneralesRepository.findById(id).orElse(new DatosGenerales());
    }

    public DatosGenerales update(DatosGenerales datosGenerales){
        return datosGeneralesRepository.save(datosGenerales);
    }

    public void deleteById(long id){
        datosGeneralesRepository.deleteById(id);
    }  


    public List<DatosGenerales> findAll(){
        return datosGeneralesRepository.findAll();
    }

    public ResponseEntity<byte[]> generarpdf (long id) throws JRException, IOException{
        DatosGenerales d=findById(id);
        Integrantes i= service.findById(id);
        Empresa e = empresaService.findById(id);
        Actividades a = actividadesService.findById(id);
        PlanDeTrabajo p = planDeTrabajoService.findById(id);
        Bibliografia b = bibliografiaService.findById(id);
        Firmas f = firmasService.findById(id);
        Map<String, Object> empParams = new HashMap<String, Object>();

        // BufferedImage image = ImageIO.read(getClass().getResource("resources/LogoYavirac.png"));
        // empParams.put("image", image);
        
			empParams.put("carrera", d.getNombrep());
            empParams.put("name_project", d.getNombrep());
            empParams.put("coordinador_carrera", d.getNombrei());
            empParams.put("actores_tutores", i.getNombreDocente());  
            empParams.put("institucion_beneficiaria",e.getNombreE());
            empParams.put("coo_insitutucion_benmeficiaria", i.getNombreDocente());
            empParams.put("codigao_proyecto", d.getCodigo());
            empParams.put("titulo", d.getNombrep());
            empParams.put("codigo", d.getCodigo());
            empParams.put("carrea_one", d.getNombrep());
            empParams.put("ciclo", d.getCiclo());
            empParams.put("presencial", d.getCiclo());
            empParams.put("dual", d.getCiclo());
            empParams.put("cobertura_localizacion", d.getCobertura());
            empParams.put("plazo_ejecucion", d.getPlazo());
            empParams.put("fecha_presentacion", d.getFechaPresentacion());
            empParams.put("fecha_inicio", d.getFechaInicio());
            empParams.put("fecha_fin", d.getFechaFinal());
            empParams.put("diaria", a.getFrecuencia());
            empParams.put("semanal", a.getFrecuencia());
            empParams.put("quincenal", a.getFrecuencia());
            empParams.put("mensual",a.getFrecuencia());
            empParams.put("convenio", a.getVinculacion());
            empParams.put("acuerdo",  a.getVinculacion());
            empParams.put("jme",  a.getVinculacion());
            empParams.put("eduacacion",  a.getVinculacion());
            empParams.put("salud",  a.getVinculacion());
            empParams.put("sanamiento",  a.getVinculacion());
            empParams.put("ambeintal",  a.getVinculacion());
            empParams.put("inter",  a.getVinculacion());
            empParams.put("investi",  a.getVinculacion());
            empParams.put("programa",  a.getVinculacion());
            empParams.put("practicas",  a.getVinculacion());
            empParams.put("investigacion",  a.getVinculacion());
            empParams.put("desarollo",  a.getVinculacion());
            empParams.put("apoyo",  a.getVinculacion());
            empParams.put("agricultura",  a.getVinculacion());
            empParams.put("vivienda",  a.getVinculacion());
            empParams.put("proteccion",  a.getVinculacion());
            empParams.put("recursos",  a.getVinculacion());
            empParams.put("transporte",  a.getVinculacion());
            empParams.put("urbano",  a.getVinculacion());
            empParams.put("turismo",  a.getVinculacion());
            empParams.put("cultura",  a.getVinculacion());
            empParams.put("cientifica",  a.getVinculacion());
            empParams.put("deportes",  a.getVinculacion());
            empParams.put("justicia",  a.getVinculacion());
            empParams.put("social",  a.getVinculacion());
            empParams.put("local",  a.getVinculacion());
            empParams.put("economia",  a.getVinculacion());
            empParams.put("tecnico",  a.getVinculacion());
            empParams.put("innovacion",  a.getVinculacion());
            empParams.put("responsabilidad",  a.getVinculacion());
            empParams.put("matriz",  a.getVinculacion());
            empParams.put("otros_1",  a.getVinculacion());
            empParams.put("otros_2",  a.getVinculacion());
            empParams.put("descripcion",  p.getDescripcionGe());
            empParams.put("analisis",  p.getAnalisisSi());
            empParams.put("justificacion",  p.getJustificacion());
            empParams.put("nombre_titulo_coo",  i.getNombreDocente());
            empParams.put("horario",  i.getHorarioDocente());
            empParams.put("funciones",  i.getFuncionesDocente());
            empParams.put("docente_1",  i.getNombreDocente());
            empParams.put("horario_1",  i.getHorarioDocente());
            empParams.put("funcion_1",  i.getFuncionesDocente());
            empParams.put("docente_2",  i.getNombreDocente());
            empParams.put("horario_2",  i.getHorarioDocente());
            empParams.put("funcion_2",  i.getFuncionesDocente());
            empParams.put("docente_3",  i.getNombreDocente());
            empParams.put("horario_3",  i.getHorarioDocente());
            empParams.put("funcion_3",  i.getFuncionesDocente());
            empParams.put("docente_4",  i.getNombreDocente());
            empParams.put("horario_4",  i.getHorarioDocente());
            empParams.put("funcion_4",  i.getFuncionesDocente());
            empParams.put("docente_5",  i.getNombreDocente());
            empParams.put("horario_5",  i.getHorarioDocente());
            empParams.put("funcion_5",  i.getFuncionesDocente());
            empParams.put("docente_6",  i.getNombreDocente());
            empParams.put("horario_6",  i.getHorarioDocente());
            empParams.put("funcion_6",  i.getFuncionesDocente());
            empParams.put("docente_7",  i.getNombreDocente());
            empParams.put("horario_7",  i.getHorarioDocente());
            empParams.put("funcion_7",  i.getFuncionesDocente());
            empParams.put("nombre_apellido1",  i.getNombreEstudiantes());
            empParams.put("ci_1",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_1",  i.getEspecialidadEstudiantes());
            empParams.put("asignadas_1",  i.getFuncionesEstudiantes());
            empParams.put("nombre_apellido2",  i.getNombreEstudiantes());
            empParams.put("ci_2",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_2",  i.getEspecialidadEstudiantes());
            empParams.put("asignadas_2",  i.getFuncionesEstudiantes());
            empParams.put("nombre_apellido3",  i.getNombreEstudiantes());
            empParams.put("ci3",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_3",  i.getEspecialidadEstudiantes());
            empParams.put("asigandas_3",  i.getFuncionesEstudiantes());
            empParams.put("nombre_apellido4",  i.getNombreEstudiantes());
            empParams.put("ci_4",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_4",  i.getEspecialidadEstudiantes());
            empParams.put("asigandas_4",  i.getFuncionesEstudiantes());
            empParams.put("nombre_apellido5",  i.getNombreEstudiantes());
            empParams.put("ci_5",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_5",  i.getEspecialidadEstudiantes());
            empParams.put("asignadas_5",  i.getFuncionesEstudiantes());
            empParams.put("nombre_apellido6",  i.getNombreEstudiantes());
            empParams.put("c1_6",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_6",  i.getEspecialidadEstudiantes());
            empParams.put("asignadas_6",  i.getFuncionesEstudiantes());
            empParams.put("nombre_apellido7",  i.getNombreEstudiantes());
            empParams.put("ci_7",  i.getCedulaEstudiantes()); 
            empParams.put("especialidad_7",  i.getEspecialidadEstudiantes());
            empParams.put("asignadas_7",  i.getFuncionesEstudiantes());
            empParams.put("nombre_insitutucion",  e.getNombreE());
            empParams.put("provincia",  e.getProvinciaMa());
            empParams.put("canton",  e.getCantonMa());
            empParams.put("parroquia",  e.getParroquiaMa());
            empParams.put("lugar_ubicacion",  e.getLugarU());
            empParams.put("beneficiarios_directos",  e.getBeneficiariosDi());
            empParams.put("beneficiarios_indirectos",  e.getBeneficiariosIndi());
            empParams.put("nombre_apellido_coo",  i.getNombreDocente());
            empParams.put("cargo_funcion",  i.getCargoEmpresarial());
            empParams.put("funcion_proyecto",  i.getFuncionesInstitucion());
            empParams.put("objetivo_general",  p.getDescripcionGe());
            empParams.put("indicadores",  p.getIndicadoresVe());
            empParams.put("medios_verificacion",  p.getIndicadorOb());
            empParams.put("componente_objetivo",  p.getObjetivosEs());
            empParams.put("componente_objetivo1",  p.getObjetivosEs());
            empParams.put("componente_objetivo2",  p.getObjetivosEs());
            empParams.put("actividad_1",  a.getEjes());
            empParams.put("actividad2",  a.getEjes());
            empParams.put("actividad_3",  a.getEjes());
            empParams.put("actividad_4",  a.getEjes());
            empParams.put("actividad_5",  a.getEjes());
            empParams.put("actividad_6",  a.getEjes());
            empParams.put("actividad_7",  a.getEjes());
            empParams.put("actividad_8",  a.getEjes());
            empParams.put("actividad_9",  a.getEjes());
            empParams.put("actividad_10",  a.getEjes());
            empParams.put("actividad_11",  a.getEjes());
            empParams.put("actividad_12",  a.getEjes());
            empParams.put("actividad_13",  a.getEjes());
            empParams.put("actividad_14",  a.getEjes());
            empParams.put("actividad_15",  a.getEjes());
            empParams.put("actividad_16",  a.getEjes());
            empParams.put("actividad_17",  a.getEjes());
            empParams.put("n/a_1",  a.getEjes());
            empParams.put("n/a_2",  a.getEjes());
            empParams.put("estra_segui", b.getEstrategias());
            empParams.put("biblografia",  b.getBibliografias());
            empParams.put("rector",  i.getNombreDocente());
            empParams.put("coordinador", i.getNombreDocente());
            empParams.put("coo_carrera",  i.getNombreDocente());
            empParams.put("docente_super", i.getNombreDocente());
            empParams.put("representante legal",  i.getNombreDocente());
            empParams.put("estudiante_final",  i.getNombreEstudiantes());

			JasperPrint empReport =
					JasperFillManager.fillReport
				   (
							JasperCompileManager.compileReport(
							ResourceUtils.getFile("classpath:projecto_pdf.jrxml")
									.getAbsolutePath()) // path of the jasper report
							, empParams // dynamic parameters
							, new JREmptyDataSource());
                            HttpHeaders headers = new HttpHeaders();
			//set the PDF format
			headers.setContentType(MediaType.APPLICATION_PDF);
			headers.setContentDispositionFormData("filename", "vinculacion.pdf");
			//create the report in PDF format
			return new ResponseEntity<byte[]>
					(JasperExportManager.exportReportToPdf(empReport), headers, HttpStatus.OK);
    }


}

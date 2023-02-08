package proyecto.api_proyecto.itv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import proyecto.api_proyecto.feature.datos_generales.DatosGenerales;
import proyecto.api_proyecto.feature.datos_generales.DatosGeneralesService;
import proyecto.api_proyecto.feature.empresa.Empresa;
import proyecto.api_proyecto.feature.empresa.EmpresaService;
import proyecto.api_proyecto.feature.integrantes.Integrantes;
import proyecto.api_proyecto.feature.integrantes.IntegrantesService;
import proyecto.api_proyecto.feature.plan_de_trabajo.PlanDeTrabajo;
import proyecto.api_proyecto.feature.plan_de_trabajo.PlanDeTrabajoService;

@Service
public class ItvService {

  @Autowired
  private EmpresaService empresaService;
  @Autowired  
  private DatosGeneralesService datosGeneralesService;
  @Autowired  
  private PlanDeTrabajoService planDeTrabajoService;
  @Autowired  
  private IntegrantesService integrantesService;

  public byte[] exportReport(Long proyectId) throws FileNotFoundException, JRException {
    // Gather data from the database based on id
    Empresa empresa = empresaService.findById(proyectId);
    PlanDeTrabajo plan = planDeTrabajoService.findById(proyectId);
    DatosGenerales datos = datosGeneralesService.findById(proyectId);
    Integrantes integrantes = integrantesService.findById(proyectId);

    // Construct a custom Model with all the fields for the ITV PDF
    ItvModel itvService = new ItvModel();
    itvService.setObjetivoPro(plan.getObjetivoPro());
    itvService.setJustificacion(plan.getJustificacion());
    itvService.setObjetivoOb(plan.getObjetivoOb());
    itvService.setObjetivosEs(plan.getObjetivosEs());

    itvService.setNumRuc(empresa.getNumRuc());
    itvService.setNombreE(empresa.getNombreE());
    itvService.setPersonaAc(empresa.getPersonaAc());
    itvService.setActividadEc(empresa.getActividadEc());
    itvService.setCorreoE(empresa.getCorreoE());
    itvService.setTelfCo(empresa.getTelfCo());
    itvService.setProvinciaMa(empresa.getProvinciaMa());
    itvService.setProvinciaSu(empresa.getProvinciaSu());
    itvService.setCantonMa(empresa.getCantonMa());
    itvService.setCantonSu(empresa.getCantonSu());
    itvService.setDireccionMa(empresa.getDireccionMa());
    itvService.setDireccionSu(empresa.getDireccionSu());
    itvService.setNumEE(empresa.getNumEE());

    itvService.setCodigo(datos.getCodigo());
    itvService.setCarreraId(datos.getCarreraId());
    itvService.setNombrep(datos.getNombrep());
    itvService.setNombrei(datos.getNombrei());
    itvService.setFecha(datos.getFecha());
    itvService.setFinanciamiento(datos.getFinanciamiento());
    itvService.setVigencia(datos.getVigencia());

    itvService.setNombreProyecto(integrantes.getNombreProyecto());
    itvService.setCargoProyecto(integrantes.getCargoProyecto());
    itvService.setFuncionesEstudiantes(integrantes.getFuncionesEstudiantes());
    itvService.setFuncionesInstitucion(integrantes.getFuncionesInstitucion());
    itvService.setNombreInstitucion(integrantes.getNombreInstitucion());
    itvService.setCargoInstitucion(integrantes.getCargoInstitucion());
    // Construct a List based on the ITV Service
    List<ItvModel> actors = new ArrayList<>();
    actors.add(0, itvService);

    // Jaspersoft Template
    File file = ResourceUtils.getFile("classpath:itvtemplate.jrxml");

    // Compile template
    JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

    // Generate dataSource that will hydrate the template
    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(actors);

    // Generate parameters needed to fill the report
    Map<String, Object> parameters = new HashMap<>();

    // Fill the Report
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

    return JasperExportManager.exportReportToPdf(jasperPrint);
  }
}

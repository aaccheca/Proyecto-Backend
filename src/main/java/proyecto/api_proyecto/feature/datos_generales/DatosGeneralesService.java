package proyecto.api_proyecto.feature.datos_generales;

import java.util.List;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class DatosGeneralesService {
    
    @Autowired
    DatosGeneralesRepository datosGeneralesRepository;

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

    public ResponseEntity<byte[]> generarpdf (long id) throws FileNotFoundException, JRException{
        DatosGenerales d=findById(id);
        Map<String, Object> empParams = new HashMap<String, Object>();
			empParams.put("carrera", d.getCiclo());
            empParams.put("name_project", d.getNombrep());
            empParams.put("coordinador_carrera", d.getNombrei());
            //empParams.put("employeeData", new JRBeanCollectionDataSource(empLst..aqui el listado));
			JasperPrint empReport =
					JasperFillManager.fillReport
				   (
							JasperCompileManager.compileReport(
							ResourceUtils.getFile("classpath:project_pdf.jrxml")
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

package proyecto.api_proyecto.feature.certificados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/certificados")
@CrossOrigin("*")
public class CertificadosController {
    
    @Autowired
    CertificadosService certificadosService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Certificados save(@RequestBody Certificados certificados){
        return certificadosService.save(certificados);
    }

    //Read
    @GetMapping("/{id}")
    public Certificados findbyId(@PathVariable long id){
        return certificadosService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Certificados update(@RequestBody Certificados certificados)
    {
        return certificadosService.save(certificados);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        certificadosService.deleteById(id);
    }

}

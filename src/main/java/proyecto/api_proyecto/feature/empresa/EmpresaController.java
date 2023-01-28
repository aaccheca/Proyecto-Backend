package proyecto.api_proyecto.feature.empresa;

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
@RequestMapping("/api/empresa")
@CrossOrigin("*")
public class EmpresaController {
    
    @Autowired
    EmpresaService empresaService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Empresa save(@RequestBody Empresa empresa){
        return empresaService.save(empresa);
    }

    //Read
    @GetMapping("/{id}")
    public Empresa findbyId(@PathVariable long id){
        return empresaService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Empresa update(@RequestBody Empresa empresa)
    {
        return empresaService.save(empresa);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        empresaService.deleteById(id);
    }

}

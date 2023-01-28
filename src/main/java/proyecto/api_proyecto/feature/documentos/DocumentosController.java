package proyecto.api_proyecto.feature.documentos;

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
@RequestMapping("/api/documentos")
@CrossOrigin("*")
public class DocumentosController {
    
    @Autowired
    DocumentosService documentosService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Documentos save(@RequestBody Documentos documentos){
        return documentosService.save(documentos);
    }

    //Read
    @GetMapping("/{id}")
    public Documentos findbyId(@PathVariable long id){
        return documentosService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Documentos update(@RequestBody Documentos documentos)
    {
        return documentosService.save(documentos);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        documentosService.deleteById(id);
    }

}

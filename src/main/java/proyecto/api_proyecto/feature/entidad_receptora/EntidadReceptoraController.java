package proyecto.api_proyecto.feature.entidad_receptora;

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
@RequestMapping("/api/entidad-receptora")
@CrossOrigin("*")
public class EntidadReceptoraController {
    
    @Autowired
    EntidadReceptoraService entidadReceptoraService;

    //CRUD

    //Create
    @PostMapping("/save")
    public EntidadReceptora save(@RequestBody EntidadReceptora entidadReceptora){
        return entidadReceptoraService.save(entidadReceptora);
    }

    //Read
    @GetMapping("/{id}")
    public EntidadReceptora findbyId(@PathVariable long id){
        return entidadReceptoraService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public EntidadReceptora update(@RequestBody EntidadReceptora entidadReceptora)
    {
        return entidadReceptoraService.save(entidadReceptora);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        entidadReceptoraService.deleteById(id);
    }

}

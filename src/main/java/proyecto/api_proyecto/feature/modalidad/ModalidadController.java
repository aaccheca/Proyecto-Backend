package proyecto.api_proyecto.feature.modalidad;

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
@RequestMapping("/api/modalidad")
@CrossOrigin("*")
public class ModalidadController {
    
    @Autowired
    ModalidadService modalidadService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Modalidad save(@RequestBody Modalidad modalidad){
        return modalidadService.save(modalidad);
    }

    //Read
    @GetMapping("/{id}")
    public Modalidad findbyId(@PathVariable long id){
        return modalidadService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Modalidad update(@RequestBody Modalidad modalidad)
    {
        return modalidadService.save(modalidad);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        modalidadService.deleteById(id);
    }

}

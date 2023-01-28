package proyecto.api_proyecto.feature.observaciones;

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
@RequestMapping("/api/observaciones")
@CrossOrigin("*")
public class ObservacionesController {

    @Autowired
    ObservacionesService observacionesService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Observaciones save(@RequestBody Observaciones observaciones){
        return observacionesService.save(observaciones);
    }

    //Read
    @GetMapping("/{id}")
    public Observaciones findbyId(@PathVariable long id){
        return observacionesService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Observaciones update(@RequestBody Observaciones observaciones)
    {
        return observacionesService.save(observaciones);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        observacionesService.deleteById(id);
    }
    
}

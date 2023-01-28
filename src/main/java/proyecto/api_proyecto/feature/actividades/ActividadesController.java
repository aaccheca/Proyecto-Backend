package proyecto.api_proyecto.feature.actividades;
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
@RequestMapping("/api/actividades")
@CrossOrigin("*")
public class ActividadesController {

    @Autowired
    ActividadesService actividadesService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Actividades save(@RequestBody Actividades actividades){
        return actividadesService.save(actividades);
    }

    //Read
    @GetMapping("/{id}")
    public Actividades findbyId(@PathVariable long id){
        return actividadesService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Actividades update(@RequestBody Actividades actividades)
    {
        return actividadesService.save(actividades);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        actividadesService.deleteById(id);
    }
    
}

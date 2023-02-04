package proyecto.api_proyecto.feature.carreras;

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
@RequestMapping("/api/carreras")
@CrossOrigin("*")
public class CarrerasController {
    
    @Autowired
    CarrerasService carrerasService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Carreras save(@RequestBody Carreras carreras){
        return carrerasService.save(carreras);
    }

    //Read
    @GetMapping("/{id}")
    public Carreras findbyId(@PathVariable long id){
        return carrerasService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Carreras update(@RequestBody Carreras carreras)
    {
        return carrerasService.save(carreras);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        carrerasService.deleteById(id);
    }

}

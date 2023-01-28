package proyecto.api_proyecto.feature.firmas;

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
@RequestMapping("/api/firmas")
@CrossOrigin("*")
public class FirmasController {

    @Autowired
    FirmasService firmasService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Firmas save(@RequestBody Firmas firmas){
        return firmasService.save(firmas);
    }

    //Read
    @GetMapping("/{id}")
    public Firmas findbyId(@PathVariable long id){
        return firmasService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Firmas update(@RequestBody Firmas firmas)
    {
        return firmasService.save(firmas);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        firmasService.deleteById(id);
    }
    
}

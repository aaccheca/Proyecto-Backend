package proyecto.api_proyecto.feature.integrantes;

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
@RequestMapping("/api/integrantes")
@CrossOrigin("*")
public class IntegrantesController {
    

    @Autowired
    IntegrantesService integrantesService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Integrantes save(@RequestBody Integrantes integrantes){
        return integrantesService.save(integrantes);
    }

    //Read
    @GetMapping("/{id}")
    public Integrantes findbyId(@PathVariable long id){
        return integrantesService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Integrantes update(@RequestBody Integrantes integrantes)
    {
        return integrantesService.save(integrantes);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        integrantesService.deleteById(id);
    }

}

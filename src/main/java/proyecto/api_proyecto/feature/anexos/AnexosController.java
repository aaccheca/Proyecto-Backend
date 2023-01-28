package proyecto.api_proyecto.feature.anexos;

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
@RequestMapping("/api/anexos")
@CrossOrigin("*")
public class AnexosController {
    
    @Autowired
    AnexosService anexosService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Anexos save(@RequestBody Anexos anexos){
        return anexosService.save(anexos);
    }

    //Read
    @GetMapping("/{id}")
    public Anexos findbyId(@PathVariable long id){
        return anexosService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Anexos update(@RequestBody Anexos anexos)
    {
        return anexosService.save(anexos);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        anexosService.deleteById(id);
    }

}

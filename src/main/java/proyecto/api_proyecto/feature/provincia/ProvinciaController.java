package proyecto.api_proyecto.feature.provincia;

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
@RequestMapping("/api/provincia")
@CrossOrigin("*")
public class ProvinciaController {
    
    @Autowired
    ProvinciaService provinciaService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Provincia save(@RequestBody Provincia provincia){
        return provinciaService.save(provincia);
    }

    //Read
    @GetMapping("/{id}")
    public Provincia findbyId(@PathVariable long id){
        return provinciaService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Provincia update(@RequestBody Provincia provincia)
    {
        return provinciaService.save(provincia);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        provinciaService.deleteById(id);
    }

}

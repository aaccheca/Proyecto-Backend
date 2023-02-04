package proyecto.api_proyecto.feature.canton;

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
@RequestMapping("/api/canton")
@CrossOrigin("*")
public class CantonController {
    
    @Autowired
    CantonService cantonService;

    //CRUD

    //Create
    @PostMapping("/save")
    public Canton save(@RequestBody Canton canton){
        return cantonService.save(canton);
    }

    //Read
    @GetMapping("/{id}")
    public Canton findbyId(@PathVariable long id){
        return cantonService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public Canton update(@RequestBody Canton canton)
    {
        return cantonService.save(canton);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        cantonService.deleteById(id);
    }

}

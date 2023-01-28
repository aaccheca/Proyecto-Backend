package proyecto.api_proyecto.feature.datos_generales;

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
@RequestMapping("/api/datos-generales")
@CrossOrigin("*")
public class DatosGeneralesController {

    @Autowired
    DatosGeneralesService datosGeneralesService;

    //CRUD

    //Create
    @PostMapping("/save")
    public DatosGenerales save(@RequestBody DatosGenerales datosGenerales){
        return datosGeneralesService.save(datosGenerales);
    }

    //Read
    @GetMapping("/{id}")
    public DatosGenerales findbyId(@PathVariable long id){
        return datosGeneralesService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public DatosGenerales update(@RequestBody DatosGenerales datosGenerales)
    {
        return datosGeneralesService.save(datosGenerales);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        datosGeneralesService.deleteById(id);
    }
    
}

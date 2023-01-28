package proyecto.api_proyecto.feature.plan_de_trabajo;

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
@RequestMapping("/api/plan-de-trabajo")
@CrossOrigin("*")
public class PlanDeTrabajoController {
    
    @Autowired
    PlanDeTrabajoService planDeTrabajoService;

    //CRUD

    //Create
    @PostMapping("/save")
    public PlanDeTrabajo save(@RequestBody PlanDeTrabajo planDeTrabajo){
        return planDeTrabajoService.save(planDeTrabajo);
    }

    //Read
    @GetMapping("/{id}")
    public PlanDeTrabajo findbyId(@PathVariable long id){
        return planDeTrabajoService.findById(id);
    }

    //Update
    @PutMapping("/update")
    public PlanDeTrabajo update(@RequestBody PlanDeTrabajo planDeTrabajo)
    {
        return planDeTrabajoService.save(planDeTrabajo);
    }

    //Delete
    @DeleteMapping("/deleteById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        planDeTrabajoService.deleteById(id);
    }

}

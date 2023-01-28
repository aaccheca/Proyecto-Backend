package proyecto.api_proyecto.feature.plan_de_trabajo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanDeTrabajoService {
    
    @Autowired
    PlanDeTrabajoRepository planDeTrabajoRepository;

    //CRUD = Create, Read, Update, Delete

    public PlanDeTrabajo save(PlanDeTrabajo planDeTrabajo){
        return planDeTrabajoRepository.save(planDeTrabajo);
    }

    public PlanDeTrabajo findById(long id){
        return planDeTrabajoRepository.findById(id).orElse(new PlanDeTrabajo());
    }

    public PlanDeTrabajo update(PlanDeTrabajo planDeTrabajo){
        return planDeTrabajoRepository.save(planDeTrabajo);
    }

    public void deleteById(long id){
        planDeTrabajoRepository.deleteById(id);
    }  


}

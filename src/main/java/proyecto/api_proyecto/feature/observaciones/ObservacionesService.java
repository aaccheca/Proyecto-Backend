package proyecto.api_proyecto.feature.observaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObservacionesService {
    
  
    @Autowired
    ObservacionesRepository observacionesRepository;

    //CRUD = Create, Read, Update, Delete

    public Observaciones save(Observaciones observaciones){
        return observacionesRepository.save(observaciones);
    }

    public Observaciones findById(long id){
        return observacionesRepository.findById(id).orElse(new Observaciones());
    }

    public Observaciones update(Observaciones observaciones){
        return observacionesRepository.save(observaciones);
    }

    public void deleteById(long id){
        observacionesRepository.deleteById(id);
    }  

}

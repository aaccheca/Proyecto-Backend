package proyecto.api_proyecto.feature.canton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CantonService {

    @Autowired
    CantonRepository cantonRepository;

    //CRUD = Create, Read, Update, Delete

    public Canton save(Canton canton){
        return cantonRepository.save(canton);
    }

    public Canton findById(long id){
        return cantonRepository.findById(id).orElse(new Canton());
    }

    public Canton update(Canton canton){
        return cantonRepository.save(canton);
    }

    public void deleteById(long id){
        cantonRepository.deleteById(id);
    }  
    
}

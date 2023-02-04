package proyecto.api_proyecto.feature.parroquia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParroquiaService {

    @Autowired
    ParroquiaRepository parroquiaRepository;

    //CRUD = Create, Read, Update, Delete

    public Parroquia save(Parroquia parroquia){
        return parroquiaRepository.save(parroquia);
    }

    public Parroquia findById(long id){
        return parroquiaRepository.findById(id).orElse(new Parroquia());
    }

    public Parroquia update(Parroquia parroquia){
        return parroquiaRepository.save(parroquia);
    }

    public void deleteById(long id){
        parroquiaRepository.deleteById(id);
    }  
    
}

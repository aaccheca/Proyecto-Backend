package proyecto.api_proyecto.feature.integrantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrantesService {
    
    @Autowired
    IntegrantesRepository integrantesRepository;

    //CRUD = Create, Read, Update, Delete

    public Integrantes save(Integrantes integrantes){
        return integrantesRepository.save(integrantes);
    }

    public Integrantes findById(long id){
        return integrantesRepository.findById(id).orElse(new Integrantes());
    }

    public Integrantes update(Integrantes integrantes){
        return integrantesRepository.save(integrantes);
    }

    public void deleteById(long id){
        integrantesRepository.deleteById(id);
    }  

}

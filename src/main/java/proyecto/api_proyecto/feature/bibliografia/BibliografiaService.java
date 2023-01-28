package proyecto.api_proyecto.feature.bibliografia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BibliografiaService {
    
    @Autowired
    BibliografiaRepository bibliografiaRepository;

    //CRUD = Create, Read, Update, Delete

    public Bibliografia save(Bibliografia bibliografia){
        return bibliografiaRepository.save(bibliografia);
    }

    public Bibliografia findById(long id){
        return bibliografiaRepository.findById(id).orElse(new Bibliografia());
    }

    public Bibliografia update(Bibliografia bibliografia){
        return bibliografiaRepository.save(bibliografia);
    }

    public void deleteById(long id){
        bibliografiaRepository.deleteById(id);
    }  

}

package proyecto.api_proyecto.feature.firmas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirmasService {
    
    @Autowired
    FirmasRepository firmasRepository;

    //CRUD = Create, Read, Update, Delete

    public Firmas save(Firmas firmas){
        return firmasRepository.save(firmas);
    }

    public Firmas findById(long id){
        return firmasRepository.findById(id).orElse(new Firmas());
    }

    public Firmas update(Firmas firmas){
        return firmasRepository.save(firmas);
    }

    public void deleteById(long id){
        firmasRepository.deleteById(id);
    }  

}

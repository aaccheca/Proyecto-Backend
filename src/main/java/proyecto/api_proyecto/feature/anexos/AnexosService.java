package proyecto.api_proyecto.feature.anexos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnexosService {

    @Autowired
    AnexosRepository anexosRepository;

    //CRUD = Create, Read, Update, Delete

    public Anexos save(Anexos anexos){
        return anexosRepository.save(anexos);
    }

    public Anexos findById(long id){
        return anexosRepository.findById(id).orElse(new Anexos());
    }

    public Anexos update(Anexos anexos){
        return anexosRepository.save(anexos);
    }

    public void deleteById(long id){
        anexosRepository.deleteById(id);
    }  
    
}

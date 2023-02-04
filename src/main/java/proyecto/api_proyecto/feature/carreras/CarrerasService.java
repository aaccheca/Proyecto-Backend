package proyecto.api_proyecto.feature.carreras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrerasService {

    @Autowired
    CarrerasRepository carrerasRepository;

    //CRUD = Create, Read, Update, Delete

    public Carreras save(Carreras carreras){
        return carrerasRepository.save(carreras);
    }

    public Carreras findById(long id){
        return carrerasRepository.findById(id).orElse(new Carreras());
    }

    public Carreras update(Carreras carreras){
        return carrerasRepository.save(carreras);
    }

    public void deleteById(long id){
        carrerasRepository.deleteById(id);
    }  
    
}

package proyecto.api_proyecto.feature.provincia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaService {

    @Autowired
    ProvinciaRepository provinciaRepository;

    //CRUD = Create, Read, Update, Delete

    public Provincia save(Provincia provincia){
        return provinciaRepository.save(provincia);
    }

    public Provincia findById(long id){
        return provinciaRepository.findById(id).orElse(new Provincia());
    }

    public Provincia update(Provincia provincia){
        return provinciaRepository.save(provincia);
    }

    public void deleteById(long id){
        provinciaRepository.deleteById(id);
    }  
    
}

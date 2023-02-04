package proyecto.api_proyecto.feature.modalidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModalidadService {

    @Autowired
    ModalidadRepository modalidadRepository;

    //CRUD = Create, Read, Update, Delete

    public Modalidad save(Modalidad modalidad){
        return modalidadRepository.save(modalidad);
    }

    public Modalidad findById(long id){
        return modalidadRepository.findById(id).orElse(new Modalidad());
    }

    public Modalidad update(Modalidad modalidad){
        return modalidadRepository.save(modalidad);
    }

    public void deleteById(long id){
        modalidadRepository.deleteById(id);
    }  
    
}

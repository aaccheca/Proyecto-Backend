package proyecto.api_proyecto.feature.entidad_receptora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntidadReceptoraService {

    @Autowired
    EntidadReceptoraRepository entidadReceptoraRepository;

    //CRUD = Create, Read, Update, Delete

    public EntidadReceptora save(EntidadReceptora entidadReceptora){
        return entidadReceptoraRepository.save(entidadReceptora);
    }

    public EntidadReceptora findById(long id){
        return entidadReceptoraRepository.findById(id).orElse(new EntidadReceptora());
    }

    public EntidadReceptora update(EntidadReceptora entidadReceptora){
        return entidadReceptoraRepository.save(entidadReceptora);
    }

    public void deleteById(long id){
        entidadReceptoraRepository.deleteById(id);
    }  
    
}

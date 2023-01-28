package proyecto.api_proyecto.feature.documentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentosService {
    
    @Autowired
    DocumentosRepository documentosRepository;

    //CRUD = Create, Read, Update, Delete

    public Documentos save(Documentos documentos){
        return documentosRepository.save(documentos);
    }

    public Documentos findById(long id){
        return documentosRepository.findById(id).orElse(new Documentos());
    }

    public Documentos update(Documentos documentos){
        return documentosRepository.save(documentos);
    }

    public void deleteById(long id){
        documentosRepository.deleteById(id);
    }  

}

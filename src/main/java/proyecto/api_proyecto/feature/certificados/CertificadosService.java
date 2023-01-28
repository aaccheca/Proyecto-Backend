package proyecto.api_proyecto.feature.certificados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificadosService {
    
@Autowired
    CertificadosRepository certificadosRepository;

    //CRUD = Create, Read, Update, Delete

    public Certificados save(Certificados certificados){
        return certificadosRepository.save(certificados);
    }

    public Certificados findById(long id){
        return certificadosRepository.findById(id).orElse(new Certificados());
    }

    public Certificados update(Certificados certificados){
        return certificadosRepository.save(certificados);
    }

    public void deleteById(long id){
        certificadosRepository.deleteById(id);
    }  

}

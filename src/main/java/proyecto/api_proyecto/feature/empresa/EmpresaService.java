package proyecto.api_proyecto.feature.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    
    @Autowired
    EmpresaRepository empresaRepository;

    //CRUD = Create, Read, Update, Delete

    public Empresa save(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public Empresa findById(long id){
        return empresaRepository.findById(id).orElse(new Empresa());
    }

    public Empresa update(Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public void deleteById(long id){
        empresaRepository.deleteById(id);
    }  

}

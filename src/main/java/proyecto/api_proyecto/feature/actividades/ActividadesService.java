package proyecto.api_proyecto.feature.actividades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActividadesService {
    
    @Autowired
    ActividadesRepository actividadesRepository;

    //CRUD = Create, Read, Update, Delete

    public Actividades save(Actividades actividades){
        return actividadesRepository.save(actividades);
    }

    public Actividades findById(long id){
        return actividadesRepository.findById(id).orElse(new Actividades());
    }

    public Actividades update(Actividades actividades){
        return actividadesRepository.save(actividades);
    }

    public void deleteById(long id){
        actividadesRepository.deleteById(id);
    }  

}

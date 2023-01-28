package proyecto.api_proyecto.feature.datos_generales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosGeneralesService {
    
    @Autowired
    DatosGeneralesRepository datosGeneralesRepository;

    //CRUD = Create, Read, Update, Delete

    public DatosGenerales save(DatosGenerales datosGenerales){
        return datosGeneralesRepository.save(datosGenerales);
    }

    public DatosGenerales findById(long id){
        return datosGeneralesRepository.findById(id).orElse(new DatosGenerales());
    }

    public DatosGenerales update(DatosGenerales datosGenerales){
        return datosGeneralesRepository.save(datosGenerales);
    }

    public void deleteById(long id){
        datosGeneralesRepository.deleteById(id);
    }  

}

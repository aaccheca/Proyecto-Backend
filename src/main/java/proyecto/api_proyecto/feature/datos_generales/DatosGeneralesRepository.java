package proyecto.api_proyecto.feature.datos_generales;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DatosGeneralesRepository extends CrudRepository<DatosGenerales, Long> {
    
    List<DatosGenerales> findAll();

}

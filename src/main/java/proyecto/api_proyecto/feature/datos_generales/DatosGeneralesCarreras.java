package proyecto.api_proyecto.feature.datos_generales;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class DatosGeneralesCarreras {

    @Id
    private long id;
    private Long dgId;
    private Long carrerasId;
    
}

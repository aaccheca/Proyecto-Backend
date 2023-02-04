package proyecto.api_proyecto.feature.empresa;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class EmpresaProvincia {

    @Id
    private long id;
    private Long empresaId;
    private Long provinciaId;
    
}
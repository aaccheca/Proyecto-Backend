package proyecto.api_proyecto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.events.Event.ID;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import proyecto.api_proyecto.feature.bibliografia.Bibliografia;
import proyecto.api_proyecto.feature.datos_generales.DatosGenerales;
import proyecto.api_proyecto.feature.datos_generales.DatosGeneralesService;
import proyecto.api_proyecto.feature.empresa.Empresa;
import proyecto.api_proyecto.feature.integrantes.Integrantes;
import proyecto.api_proyecto.feature.observaciones.Observaciones;
import proyecto.api_proyecto.feature.documentos.Documentos;
import proyecto.api_proyecto.feature.actividades.Actividades;
import proyecto.api_proyecto.feature.anexos.Anexos;
import proyecto.api_proyecto.feature.plan_de_trabajo.PlanDeTrabajo;

@SpringBootTest
class ApiProyectoApplicationTests {

	@Test
	public void testproyecto() {
		DatosGenerales datosGenerales = new DatosGenerales();
		Assertions.assertNotNull(datosGenerales);
		Empresa empresa = new Empresa();
		Assertions.assertNotNull(empresa);
		Integrantes integrantes = new Integrantes();
		Assertions.assertNotNull(integrantes);
		Bibliografia bibliografia = new Bibliografia();
		Assertions.assertNotNull(bibliografia);
		Documentos documentos = new Documentos();
		Assertions.assertNotNull(documentos);
		Anexos anexos = new Anexos();
		Assertions.assertNotNull(anexos);
		Actividades actividades = new Actividades();
		Assertions.assertNotNull(actividades);
		Observaciones observaciones = new Observaciones();
		Assertions.assertNotNull(observaciones);
		PlanDeTrabajo pTrabajo = new PlanDeTrabajo();
		Assertions.assertNotNull(pTrabajo);
	}

}

package proyecto.api_proyecto.itv;

import lombok.Data;

@Data
public class ItvModel {
  
  // Plan de trabajo Data
  private String objetivoPro;
  private String justificacion;
  private String objetivoOb;
  private String objetivosEs;
  private String conclusiones;

  // Empresa Data
  private String nombreE;
  private String personaAc;
  private String numRuc;
  private String actividadEc;
  private String correoE;
  private String telfCo;
  private String provinciaMa;
  private String cantonMa;
  private String direccionMa;
  private String provinciaSu;
  private String cantonSu;
  private String direccionSu;
  private String numEE;

  // Datos Generales Data
  private String codigo;
  private String nombrep;
  private String nombrei;
  private long carreraId;
  private String fecha;
  private String financiamiento;
  private String vigencia;

  // Integrantes Data
  private String nombreProyecto;
  private String cargoProyecto;
  private String funcionesEstudiantes;
  private String nombreInstitucion;
  private String cargoInstitucion;
  private String funcionesInstitucion;

}

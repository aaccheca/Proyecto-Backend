package proyecto.api_proyecto.itv;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/itv")
@CrossOrigin("*")
public class ItvController {
    @Autowired
    ItvService service;

    @GetMapping("/reporte/{format}")
    public void generateReport(@PathVariable String format, HttpServletResponse response) throws Exception {

      byte[] data = service.exportReport(format);

      streamReport(response, data, "my_report.pdf");
  }

  protected void streamReport(HttpServletResponse response, byte[] data, String name)
          throws IOException {

      response.setContentType("application/pdf");
      response.setHeader("Content-disposition", "attachment; filename=" + name);
      response.setContentLength(data.length);

      response.getOutputStream().write(data);
      response.getOutputStream().flush();
  }

}

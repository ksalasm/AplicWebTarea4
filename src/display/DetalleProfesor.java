package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.ProfesorRepository;
import domain.Profesor;
import util.ProfesorDTO;
import util.ProfesorAssembler;

public class DetalleProfesor extends PageController {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ProfesorRepository profesores = (ProfesorRepository) context.getBean("profesorRepository");
    try {
	
	String tp = request.getParameter("tp");
	int tipoIngreso = Integer.parseInt(tp);
	
	switch(tipoIngreso) {
	 case 1: //PARA AGREGAR
		forward("/agregarProfesor.jsp",request,response);
		 break;
	 case 2:  //PARA DETALLE - MODIFICAR
			String id = request.getParameter("id");
			int idProf = Integer.parseInt(id);
			Profesor prof = profesores.findProfesor(idProf);
			ProfesorDTO dto = ProfesorAssembler.CreateDTO(prof);
			request.setAttribute("profesor",dto);
			forward("/detalleProfesor.jsp",request,response);
		 break;
	 case 3:  //PARA ELIMINAR
			String id2 = request.getParameter("id");
			int idProf2 = Integer.parseInt(id2);
			Profesor prof2 = profesores.findProfesor(idProf2);
			ProfesorDTO dto2 = ProfesorAssembler.CreateDTO(prof2);
			request.setAttribute("profesor",dto2);
			forward("/eliminarProfesor.jsp",request,response);
		 break;
	 }
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}
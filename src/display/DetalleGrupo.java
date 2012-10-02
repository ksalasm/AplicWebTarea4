package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;
import domain.GrupoRepository;
import domain.Grupo;
import util.GrupoDTO;
import util.GrupoAssembler;

public class DetalleGrupo extends PageController {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	GrupoRepository grupos = (GrupoRepository) context.getBean("grupoRepository");
    try {
	
	String tp = request.getParameter("tp");
	int tipoIngreso = Integer.parseInt(tp);
	
	switch(tipoIngreso) {
	 case 1: //PARA AGREGAR
		forward("/agregarGrupo.jsp",request,response);
		 break;
	 case 2:  //PARA DETALLE - MODIFICAR
			String id = request.getParameter("id");
			int idGrupo = Integer.parseInt(id);
			Grupo grupo = grupos.findGrupo(idGrupo);
			GrupoDTO dto = GrupoAssembler.CreateDTO(grupo);
			request.setAttribute("grupo",dto);
			forward("/detalleGrupo.jsp",request,response);
		 break;
	 case 3:  //PARA ELIMINAR
			String id2 = request.getParameter("id");
			int idGrupo2 = Integer.parseInt(id2);
			Grupo grupo2 = grupos.findGrupo(idGrupo2);
			GrupoDTO dto2 = GrupoAssembler.CreateDTO(grupo2);
			request.setAttribute("grupo",dto2);
			forward("/eliminarGrupo.jsp",request,response);
		 break;
	 }
    } catch (Exception e) {
      request.setAttribute("mensaje",e.getMessage());
      forward("/paginaError.jsp",request,response);
    }
  }
}
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

public class ActualizarGrupo extends PageController {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      GrupoRepository grupos = (GrupoRepository) context.getBean("grupoRepository");
    try {
        String id = request.getParameter("id");
        int idGrupo = Integer.parseInt(id);
		String numero = request.getParameter("numero");
        String sigla = request.getParameter("sigla");
        String nombre = request.getParameter("nombre");
        String horario = request.getParameter("horario");
        String aula = request.getParameter("aula");
		String idProfesorS = request.getParameter("idProfesor");
		int idProfesor = Integer.parseInt(idProfesorS);
		
        Grupo grupo = grupos.findGrupo(idGrupo);
        try {
            //if (numero!=null) 
			grupo.setNumero(Integer.parseInt(numero));
            if (sigla!=null) grupo.setSigla(sigla);
            if (nombre!=null) grupo.setNombre(nombre);
            if (horario!=null) grupo.setHorario(horario);
            if (aula!=null) grupo.setAula(aula);
			grupo.setIdProfesor(idProfesor);
                grupos.updateGrupo(grupo);
        } catch (Exception e) {}
        response.sendRedirect("listaGrupos");
    } catch (Exception e) {
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}
<%@ page import="java.util.*" %>
<%@ page import="util.*" %>
<html>
  <head>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Listado de grupos</h2>
  <% List grupos = (List)request.getAttribute("grupos"); %>
  <table>
    <tr><th>N&uacute;mero</th><th>Sigla</th><th>Nombre</th><th>Horario</th><th>Aula</th><th>IdProfesor</th></tr>
    <% for(int i = 0, n = grupos.size(); i < n; i++) {
         GrupoDTO grupo = (GrupoDTO)grupos.get(i); %>
        <tr><td><%= grupo.getNumero() %></td>
        <td><%= grupo.getSigla() %></td>
        <td><%= grupo.getNombre() %></td>
		<td><%= grupo.getHorario() %></td>
        <td><%= grupo.getAula() %></td>
        <td><%= grupo.getIdProfesor() %></td>
        <td><a href='/universidad/detalleGrupo?tp=2&id=<%= grupo.getId() %>'>
              <input type="submit" value="Detalle"/></a>
            <a href='/universidad/eliminarGrupo?tp=3&id=<%= grupo.getId() %>'>
              <input type="submit" value="Eliminar"/></a></td></tr>
    <% } %>
  </table>
    <table>
      <tr><td><a href='/universidad/agregarGrupo?tp=1'>
        <input type="submit" name="action" value="Agregar"/></a>
      </td></tr>
    </table>
</html>
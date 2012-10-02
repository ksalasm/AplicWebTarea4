<%@ page import="java.util.Map" %>
<%@ page import="util.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Eliminar Grupo</h2>
  <% GrupoDTO grupo = (GrupoDTO)request.getAttribute("grupo"); %>
  <form name="BorrarGrupo" action="/universidad/borrarGrupo" method="get">
  <input type="hidden" name="id" value="<%= grupo.getId() %>"/>
  <table>
   <tr><td>N&uacute;mero:</td><td><input type="text" name="numero" value="<%= grupo.getNumero() %>" readonly="true"/></td></tr>
    <tr><td>Sigla:</td><td><input type="text" name="sigla" value="<%= grupo.getSigla() %>" readonly="true"/></td></tr>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%= grupo.getNombre() %>" readonly="true"/></td></tr>
    <tr><td>Horario:</td><td><input type="text" name="horario" value="<%= grupo.getHorario() %>" readonly="true"/></td></tr>
    <tr><td>Aula:</td><td><input type="text" name="aula" value="<%= grupo.getAula() %>" readonly="true"/></td></tr>
	<tr><td>Id Profesor:</td><td><input type="text" name="idProfesor" value="<%= grupo.getIdProfesor() %>" readonly="true"/></td></tr>
    <tr><td></td><td><input type="submit" value="Eliminar" /></td></tr>
  </table>
  </form>
</html>

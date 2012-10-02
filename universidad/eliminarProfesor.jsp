<%@ page import="java.util.Map" %>
<%@ page import="util.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Eliminar Profesor</h2>
  <% ProfesorDTO prof = (ProfesorDTO)request.getAttribute("profesor"); %>
  <form name="BorrarProfesor" action="/universidad/borrarProfesor" method="get">
  <input type="hidden" name="id" value="<%= prof.getId() %>"/>
  <table>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%= prof.getNombre() %>" readonly="true"/></td></tr>
    <tr><td>C&eacute;dula:</td><td><input type="text" name="cedula" value="<%= prof.getCedula() %>" readonly="true"/></td></tr>
    <tr><td>T&iacute;tulo:</td><td><input type="text" name="titulo" value="<%= prof.getTitulo() %>" readonly="true"/></td></tr>
    <tr><td>Area:</td><td><input type="text" name="area" value="<%= prof.getArea() %>" readonly="true"/></td></tr>
    <tr><td>Tel&eacute;fono:</td><td><input type="text" name="telefono" value="<%= prof.getTelefono() %>" readonly="true"/></td></tr>
    <tr><td></td><td><input type="submit" value="Eliminar" /></td></tr>
  </table>
  </form>
</html>
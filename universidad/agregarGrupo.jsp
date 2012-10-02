<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <h1>Sistema Universitario</h1>
  <h2>Agregar Grupo</h2>
  <form name="InsertarGrupo" action="/universidad/insertarGrupo" method="get">
  <table>
    <tr><td>N&uacute;mero:</td><td><input type="text" name="numero" value=""/></td></tr>
    <tr><td>Sigla:</td><td><input type="text" name="sigla" value=""/></td></tr>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value=""/></td></tr>
    <tr><td>Horario:</td><td><input type="text" name="horario" value=""/></td></tr>
    <tr><td>Aula:</td><td><input type="text" name="aula" value=""/></td></tr>
	<tr><td>Id Profesor:</td><td><input type="text" name="idProfesor" value=""/></td></tr>
    <tr><td></td><td><input type="submit" value="Agregar" /></td></tr>
  </table>
  </form>
</html>
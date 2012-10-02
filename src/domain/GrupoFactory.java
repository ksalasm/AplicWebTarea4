package domain;

public class GrupoFactory {
  public Grupo Create(int id,int numero,String sigla,String nombre,String horario,String aula,int idProfesor) {
    try {
      Grupo grupo = new Grupo();
      grupo.setId(id);
      grupo.setNumero(numero);
      grupo.setSigla(sigla);
      grupo.setNombre(nombre);
      grupo.setHorario(horario);
      grupo.setAula(aula);
	  grupo.setIdProfesor(idProfesor);
      return grupo;
    } catch (Exception e) {
      return null;
    }
  }
}
package util;

public class GrupoDTO {
  private int id;
  private int numero;
  private String sigla;
  private String nombre;
  private String horario;
  private String aula;
  private int idProfesor;

  public int getId() {return id;}
  public int getNumero() {return numero;}
  public String getSigla() {return sigla;}
  public String getNombre() {return nombre;}
  public String getHorario() {return horario;}
  public String getAula() {return aula;}
  public int getIdProfesor() {return idProfesor;}
  
  public void setId(int id) {this.id=id;}
  public void setNumero(int num) {numero=num;}
  public void setSigla(String sig) {sigla=sig;}
  public void setNombre(String nomb) {nombre=nomb;}
  public void setHorario(String hora) {horario=hora;}
  public void setAula(String aul) {aula=aul;}
  public void setIdProfesor(int idProf) {idProfesor=idProf;}
}

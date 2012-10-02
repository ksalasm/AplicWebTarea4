package domain;

import java.util.*;

public class Grupo {
  private int id;
  private int numero;
  private String sigla;
  private String nombre;
  private String horario;
  private String aula;
  private int idProfesor;

  public Grupo () {
  };
  public void setId(int id) {this.id=id;}
  public void setNumero(int numero) {this.numero=numero;}
  public void setSigla(String sigla) {this.sigla=sigla;}
  public void setNombre(String nombre) {this.nombre=nombre;}
  public void setHorario(String horario) {this.horario=horario;}
  public void setAula(String aula) {this.aula=aula;}
  public void setIdProfesor(int idProfesor) {this.idProfesor=idProfesor;}  
  
  public int getId() {return id;}
  public int getNumero() {return numero;}
  public String getSigla() {return sigla;}
  public String getNombre() {return nombre;}
  public String getHorario() {return horario;}
  public String getAula() {return aula;}
  public int getIdProfesor() {return idProfesor;}
}
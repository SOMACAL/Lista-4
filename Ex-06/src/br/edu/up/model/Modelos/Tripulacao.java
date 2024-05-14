package br.edu.up.model.Modelos;

public class Tripulacao extends Pessoa {
  private String idAeronautica;
  private String matricula;

  public Tripulacao() {
    
  }

  public Tripulacao(String nome, String rg, String idAeronautica, String matricula) {
    super(nome, rg);
    this.idAeronautica = idAeronautica;
    this.matricula = matricula;
  }

  public String getIdAeronautica() {
    return idAeronautica;
  }

  public void setIdAeronautica(String idAeronautica) {
    this.idAeronautica = idAeronautica;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
}

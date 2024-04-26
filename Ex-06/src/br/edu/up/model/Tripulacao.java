package br.edu.up.model;

public class Tripulacao extends Pessoa {
  private String idAeronautica;
  private String matricula;

  public void Super(String nome, String rg, String idAeronautica, String matricula) {
    this.setNome(nome);
    this.setRg(rg);
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

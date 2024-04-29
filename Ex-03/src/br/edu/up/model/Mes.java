package br.edu.up.model;
import br.edu.up.model.Dia;

public class Mes {
  private int Nome;
  private int QtdeDias;
  private Dia[] Dias;


  public int getNome() {
    return this.Nome;
}

public int getQtdeDias() {
    return this.QtdeDias;
}

public Dia[] getDias() {
    return this.Dias;
}

public void setNome(int Nome) {
    this.Nome = Nome;
}

public void setQtdeDias(int QtdeDias) {
    this.QtdeDias = QtdeDias;
}

public void setDias(Dia[] Dias) {
  this.Dias = Dias;
}
}

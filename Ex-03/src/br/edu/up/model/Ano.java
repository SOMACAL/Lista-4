package br.edu.up.model;
import br.edu.up.model.Mes;

public class Ano {
  private int Ano;
  private boolean Bissexto;
  private Mes[] Meses;

  public int getAno() {
    return this.Ano;
}

public boolean getBissexto() {
    return this.Bissexto;
}

public Mes[] getMeses() {
    return this.Meses;
}

public void setAno(int Ano) {
    this.Ano = Ano;
}

public void setBissexto(boolean Bissexto) {
    this.Bissexto = Bissexto;
}
public void setMeses(Mes[] Meses) {
  this.Meses = Meses;
}


}

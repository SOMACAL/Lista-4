package br.edu.up.model;
import br.edu.up.model.Compromisso;

public class Dia {
  private int DiaMes;
  private Compromisso[] Compromissos;

  public int getDiaMes() {
    return this.DiaMes;
}

public Compromisso[] getCompromissos() {
    return this.Compromissos;
}


public void setDiaMes(int DiaMes) {
    this.DiaMes = DiaMes;
}

public void setCompromissos(Compromisso[] Compromissos) {
    this.Compromissos = Compromissos;
}
}

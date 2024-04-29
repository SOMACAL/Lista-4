package br.edu.up.model;


public class Compromisso {
  private String Pessoa;
  private String Local;
  private String Assunto ;
  private int Hora;

  public String getPessoa() {
    return this.Pessoa;
}

public String getLocal() {
    return this.Local;
}

public String getAssunto() {
    return this.Assunto;
}

public int getHora() {
    return this.Hora;
}

public void setPessoa(String Pessoa) {
    this.Pessoa = Pessoa;
}

public void setLocal(String Local) {
    this.Local = Local;
}
public void setAssunto(String Assunto) {
  this.Assunto = Assunto;
}

public void setHora(int Hora) {
  this.Hora = Hora;
}

}

package br.edu.up.model;

import java.util.ArrayList;

public class Aeronave {
  private String codVoo;
  private String tipoVoo;
  private int qtdAcentos = 200;
  private ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>(200);

  public Aeronave() {

  }
  
  public Aeronave(String codVoo, String tipoVoo, int qtdAcentos) {
    this.codVoo = codVoo;
    this.tipoVoo = tipoVoo;
    this.qtdAcentos = qtdAcentos;
  }

  public String getCodVoo() {
    return codVoo;
  }

  public void setCodVoo(String codVoo) {
    this.codVoo = codVoo;
  }

  public String getTipoVoo() {
    return tipoVoo;
  }

  public void setTipoVoo(String tipoVoo) {
    this.tipoVoo = tipoVoo;
  }

  public int getQtdAcentos() {
    return qtdAcentos;
  }

  public void setQtdAcentos(int qtdAcentos) {
    this.qtdAcentos = qtdAcentos;
  }

  public ArrayList<Passageiro> getPassageiros() {
    return passageiros;
  }

  public void setPassageiros(ArrayList<Passageiro> passageiros) {
    this.passageiros = passageiros;
  }
}

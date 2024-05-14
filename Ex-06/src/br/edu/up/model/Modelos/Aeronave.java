package br.edu.up.model.Modelos;

import java.util.ArrayList;

public class Aeronave {
  private String codVoo;
  private String tipoVoo;
  private int qtdAcentos = 200;
  private Comandante comandante;
  private ArrayList<Tripulacao> tripulantes;
  private ArrayList<Passageiro> passageiros;

  public Aeronave() {
    this.tripulantes = new ArrayList<Tripulacao>(5);
    this.passageiros = new ArrayList<Passageiro>(200);
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

  public Comandante getComandante() {
    return comandante;
  }

  public void setComandante(Comandante comandante) {
    this.comandante = comandante;
  }

  public ArrayList<Tripulacao> getTripulantes() {
    return tripulantes;
  }

  public void setTripulantes(ArrayList<Tripulacao> tripulantes) {
    this.tripulantes = tripulantes;
  }

  public int capacidadeMaximaTripulantes() {
    return 5;
  }

  public ArrayList<Passageiro> getPassageiros() {
    return passageiros;
  }

  public void setPassageiros(ArrayList<Passageiro> passageiros) {
    this.passageiros = passageiros;
  }

  public int capacidadeMaximaPassageiros() {
    return this.qtdAcentos;
  }
}

package br.edu.up.model;

public class Passageiro extends Pessoa {
  private String idBagagem;
  private Passagem passagem;

  public void Super(String nome, String rg, String idBagagem, Passagem passagem) {
    this.setNome(nome);
    this.setRg(rg);
    this.idBagagem = idBagagem;
    this.passagem = passagem;
  }

  public String getIdBagagem() {
    return idBagagem;
  }

  public void setIdBagagem(String idBagagem) {
    this.idBagagem = idBagagem;
  }

  public Passagem getPassagem() {
    return passagem;
  }

  public void setPassagem(Passagem passagem) {
    this.passagem = passagem;
  }

  public Passageiro() {

  }
}

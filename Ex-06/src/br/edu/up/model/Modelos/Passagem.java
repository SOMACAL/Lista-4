package br.edu.up.model.Modelos;

public class Passagem {
  private int id;
  private String classe;
  private String numAcento;
  private DataVoo dataVoo;

  public Passagem() {

  }

  public Passagem(String classe, String numAcento, DataVoo dataVoo) {
    this.classe = classe;
    this.numAcento = numAcento;
    this.dataVoo = dataVoo;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public String getNumAcento() {
    return numAcento;
  }

  public void setNumAcento(String numAcento) {
    this.numAcento = numAcento;
  }

  public DataVoo getDataVoo() {
    return dataVoo;
  }

  public void setDataVoo(DataVoo dataVoo) {
    this.dataVoo = dataVoo;
  }
}

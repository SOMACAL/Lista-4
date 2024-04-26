package br.edu.up.model;
import java.util.Date;

public class Passagem {
  private String classe;
  private String numAcento;
  private Date dataVoo;

  public Passagem() {
    
  }
  
  public Passagem(String classe, String numAcento, Date dataVoo) {
    this.classe = classe;
    this.numAcento = numAcento;
    this.dataVoo = dataVoo;
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

  public Date getDataVoo() {
    return dataVoo;
  }

  public void setDataVoo(Date dataVoo) {
    this.dataVoo = dataVoo;
  }
}

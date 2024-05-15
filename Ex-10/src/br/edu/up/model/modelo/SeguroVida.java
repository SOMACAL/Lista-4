package br.edu.up.model.modelo;

public class SeguroVida extends Seguro {
  private boolean cobreDoenca;
  private boolean cobreAcidente;

  public SeguroVida() {
    
  }

  public SeguroVida(String apolice, Segurado segurado, double vlrApolice, String dtaInicio, String dtaFim, boolean cobreDoenca, boolean cobreAcidente) {
    super(apolice, segurado, vlrApolice, dtaInicio, dtaFim);
    this.cobreDoenca = cobreDoenca;
    this.cobreAcidente = cobreAcidente;
  }

  public boolean isCobreDoenca() {
    return cobreDoenca;
  }

  public void setCobreDoenca(boolean cobreDoenca) {
    this.cobreDoenca = cobreDoenca;
  }

  public boolean isCobreAcidente() {
    return cobreAcidente;
  }

  public void setCobreAcidente(boolean cobreAcidente) {
    this.cobreAcidente = cobreAcidente;
  }

  @Override
  public SeguroVida getDados() {
    return this;
  }
}

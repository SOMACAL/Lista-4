package br.edu.up.model.modelo;

public abstract class Seguro {
  private String apolice;
  private Segurado segurado;
  private double vlrApolice;
  private String dtaInicio;
  private String dtaFim;

  public Seguro() {

  }

  public Seguro(String apolice, Segurado segurado, double vlrApolice, String dtaInicio, String dtaFim) {
    this.apolice = apolice;
    this.segurado = segurado;
    this.vlrApolice = vlrApolice;
    this.dtaInicio = dtaInicio;
    this.dtaFim = dtaFim;
  }

  public String getApolice() {
    return apolice;
  }

  public void setApolice(String apolice) {
    this.apolice = apolice;
  }

  public Segurado getSegurado() {
    return segurado;
  }

  public void setSegurado(Segurado segurado) {
    this.segurado = segurado;
  }

  public double getVlrApolice() {
    return vlrApolice;
  }

  public void setVlrApolice(double vlrApolice) {
    this.vlrApolice = vlrApolice;
  }

  public String getDtaInicio() {
    return dtaInicio;
  }

  public void setDtaInicio(String dtaInicio) {
    this.dtaInicio = dtaInicio;
  }

  public String getDtaFim() {
    return dtaFim;
  }

  public void setDtaFim(String dtaFim) {
    this.dtaFim = dtaFim;
  }

  public Seguro getDados() {
    return null;
  }
}

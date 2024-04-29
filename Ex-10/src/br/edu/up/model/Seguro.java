package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
  private String apolice;
  private Segurado segurado;
  private double vlrApolice;
  private LocalDate dtaInicio;
  private LocalDate dtaFim;

  public Seguro() {

  }

  public Seguro(String apolice, Segurado segurado, double vlrApolice, LocalDate dtaInicio, LocalDate dtaFim) {
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
  
  public LocalDate getDtaInicio() {
    return dtaInicio;
  }
  
  public Seguro getDados() {
    return this;
  }
}

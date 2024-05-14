package br.edu.up.model.Modelos;

public class DataVoo {
  private String dia;
  private String mes;
  private String ano;
  private String hora;

  public DataVoo() {
    
  }

  public DataVoo(String dia, String mes, String ano, String hora) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.hora = hora;
  }

  public String getDia() {
    return dia;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public String getMes() {
    return mes;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public String getAno() {
    return ano;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }
}

package br.edu.up.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Estacionamento {
  private Date data = new Date();
  private ArrayList<Veiculo> vagas = new ArrayList<>(10);
  private ArrayList<Veiculo> relatorio = new ArrayList<>();

  public Estacionamento() {

  }

  public Estacionamento(ArrayList<Veiculo> relatorio) {
    this.relatorio = relatorio;
  }

  public String getData() {
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    return formatoData.format(data);
  }

  public ArrayList<Veiculo> getVagas() {
    return vagas;
  }

  public ArrayList<Veiculo> getRelatorio() {
    return relatorio;
  }

  public void addVeiculoRelatorio(Veiculo veiculo) {
    this.relatorio.add(veiculo);
  }
}

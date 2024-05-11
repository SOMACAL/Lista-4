package br.edu.up.controller;

import java.util.ArrayList;
import br.edu.up.model.Estacionamento;
import br.edu.up.model.Veiculo;
import br.edu.up.view.View;

public class EstacionamentoController {
  public void addCarro(Estacionamento estacionamento, Veiculo veiculo) {
    ArrayList<Veiculo> vagas = estacionamento.getVagas();
    ArrayList<Veiculo> relatorio = estacionamento.getRelatorio();

    vagas.add(veiculo);
    relatorio.add(veiculo);
  }

  public Veiculo removerCarro(ArrayList<Veiculo> vagas, String placa) {
    for (Veiculo veiculo : vagas) {
      if (veiculo.getPlaca().equals(placa)) {
        vagas.remove(veiculo);
        return veiculo;
      }
    }
    return null;
  }

  public Veiculo buscarCarro(ArrayList<Veiculo> vagas, String placa) {
    for (Veiculo veiculo : vagas) {
      if (veiculo.getPlaca().equals(placa)) {
        return veiculo;
      }
    }

    return null;
  }

  public double calcularGanhos(ArrayList<Veiculo> relatorio) {
    int qtdCarros = relatorio.size();

    return qtdCarros * 5;
  }

  public void emitirRelatorio(ArrayList<Veiculo> relatorio, Estacionamento estacionamento) {
    View view = new View();
    double valor = calcularGanhos(relatorio);
    view.imprimirRelatorio(relatorio, valor, estacionamento);
  }

  public boolean dispVaga(ArrayList<Veiculo> vagas) {
    if (vagas.size() > 10) {
      return false;
    }

    return true;
  }

}

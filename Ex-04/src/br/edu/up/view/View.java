package br.edu.up.view;

import java.util.ArrayList;
import br.edu.up.model.Console;
import br.edu.up.model.Estacionamento;
import br.edu.up.model.Veiculo;

public class View {
  public int menuEstacionamento() {
    System.out.println("\n----------Bem vindo ao sistema de estacionamento----------\n");
    System.out.println("1- Registrar Carro.");
    System.out.println("2- Retirar Carro.");
    System.out.println("3- Veiculos Estacionados.");
    System.out.println("4- Relatório.");
    System.out.println("0- Sair.\n");

    return Console.readInt("Informe a opção desejada: ");
  }

  public Veiculo menuRegistroDeCarro() {
    Veiculo veiculo = new Veiculo();
    System.out.println("\n----------Registro de Carro----------\n");
    veiculo.setPlaca(Console.readString("Informe a placa: "));
    veiculo.setModelo(Console.readString("Informe o modelo: "));
    veiculo.setCor(Console.readString("Informe a cor: "));

    return veiculo;
  }

  public String retirarCarro() {
    System.out.println("\n----------Retirada de Carro----------\n");
    return Console.readString("Informe a placa: ");
  }

  public void mostrarEstacionados(ArrayList<Veiculo> vagas) {
    System.out.println("\n----------Carros Estacionados----------");

    for (Veiculo veiculo : vagas) {
      System.out.println("modelo: " + veiculo.getModelo() + "\nPlaca: " + veiculo.getPlaca() + "\nCor: " + veiculo.getCor());
      System.out.println("--------------------");
    }
  }

  public void imprimirRelatorio(ArrayList<Veiculo> relatorio, double valor, Estacionamento estacionamento) {
    System.out.println("\n---------Relatório de Veículos----------");
    for (Veiculo veiculo : relatorio) {
      System.out.println("modelo: " + veiculo.getModelo() + "\nPlaca: " + veiculo.getPlaca() + "\nCor: " + veiculo.getCor());
      System.out.println("--------------------");
    }

    System.out.println("O total de ganhos foi para o dia " + estacionamento.getData() + " foi de R$" + valor);
  }

  // Avisos
  public void veiculoCadastrado() {
    System.out.println("\nVeículo cadastrado com sucesso.");
  }

  public void veiculoEstacionado() {
    System.out.println("\nVeículo já estacionado.");
  }

  public void estacionamentoVazio() {
    System.out.println("\nEstacionamento sem carros no momento.");
  }

  public void estacionadoLotado() {
    System.out.println("\nEstacionamento sem capacidade.");
  }

  public void veiculoRetirado() {
    System.out.println("\nVeiculo retirado com sucesso.");
  }

  public void veiculoIndisponivel() {
    System.out.println("\nVeiculo não encontrado.");
  }

  public void relatorioVazio() {
    System.out.println("\nRelatório Vazio.");
  }
}

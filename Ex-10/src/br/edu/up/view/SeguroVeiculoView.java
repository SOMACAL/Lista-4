package br.edu.up.view;

import br.edu.up.controller.SeguradoController;
import br.edu.up.model.Console;
import br.edu.up.model.lista.ListaSegurado;
import br.edu.up.model.modelo.Segurado;
import br.edu.up.model.modelo.SeguroVeiculo;

public class SeguroVeiculoView {
  public static SeguroVeiculo adicionar(ListaSegurado segurados) {
    String rgBuscado = SeguradoView.localizarRg();

    Segurado seguradoBuscado = SeguradoController.localizarPorRg(segurados, rgBuscado);

    if (seguradoBuscado == null) {
      SeguradoView.seguradoNaoLocalizado();
      return null;
    }

    SeguroVeiculo seguroVeiculo = new SeguroVeiculo();
    seguroVeiculo.setApolice(Console.readString("Digite o número da apólice: "));
    seguroVeiculo.setSegurado(seguradoBuscado);
    seguroVeiculo.setVlrApolice(Console.readDouble("Digite o valor da apólice: "));
    seguroVeiculo.setDtaInicio(Console.readString("Data Início: "));
    seguroVeiculo.setDtaFim(Console.readString("Data do Fim: "));
    seguroVeiculo.setVlrFranquia(Console.readDouble("Valor da franquia: "));

    int carroReserva;
    do {
      carroReserva = Console.readInt("Tem carro reserva: (1 - SIM/ 0 - NÃO): ");

      if (carroReserva != 1 && carroReserva != 0) {
        ErroView.opcaoInvalida();
      }
    } while (carroReserva != 1 && carroReserva != 0);

    if (carroReserva == 1) {
      seguroVeiculo.setTemCarroReserva(true);
    } else {
      seguroVeiculo.setTemCarroReserva(false);
    }

    int cobreVidro;
    do {
      cobreVidro = Console.readInt("Cobre vidros: (1 - SIM/ 0 - NÃO): ");

      if (cobreVidro != 1 && cobreVidro != 0) {
        ErroView.opcaoInvalida();
      }
    } while (cobreVidro != 1 && cobreVidro != 0);

    if (cobreVidro == 1) {
      seguroVeiculo.setCobreVidros(true);
    } else {
      seguroVeiculo.setCobreVidros(false);
    }

    adicionadoSucesso(seguroVeiculo);

    return seguroVeiculo;
  }

  public static void visualizar(SeguroVeiculo seguroVeiculo) {
    System.out.println("\nNome: " + seguroVeiculo.getApolice());

    System.out.println("Apólice: " + seguroVeiculo.getVlrApolice());

    Segurado segurado = seguroVeiculo.getSegurado();
    System.out.println(" Segurado: { ");
    System.out.println("  Rg: " + segurado.getRg());
    System.out.println("  CPF: " + segurado.getCpf());
    System.out.println("  Gênero: " + segurado.getGenero());
    System.out.println("  Telefone: " + segurado.getTelefone());
    System.out.println("  Endereço: " + segurado.getEndereco());
    System.out.println("  CEP: " + segurado.getCep());
    System.out.println(" }");

    System.out.println("Data do Início: " + seguroVeiculo.getDtaInicio());
    System.out.println("Data do Fim: " + seguroVeiculo.getDtaFim());
    System.out.println("Valor da Franquia: " + seguroVeiculo.getVlrFranquia());
    System.out.println("Tem Carro Reserva: " + seguroVeiculo.isTemCarroReserva());
    System.out.println("Cobre Vidros: " + seguroVeiculo.isCobreVidros());
    System.out.println("*********************");
  }

  public static void adicionadoSucesso(SeguroVeiculo seguroVeiculo) {
    System.out
        .println("\nSeguro de veículo com a apólice " + seguroVeiculo.getApolice() + " adicionado com sucesso!\n");
    visualizar(seguroVeiculo);
  }
}
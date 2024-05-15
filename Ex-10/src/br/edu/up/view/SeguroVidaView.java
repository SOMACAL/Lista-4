package br.edu.up.view;

import br.edu.up.controller.SeguradoController;
import br.edu.up.model.Console;
import br.edu.up.model.lista.ListaSegurado;
import br.edu.up.model.modelo.Segurado;
import br.edu.up.model.modelo.SeguroVida;

public class SeguroVidaView {
  public static SeguroVida adicionar(ListaSegurado segurados) {
    String rgBuscado = SeguradoView.localizarRg();

    Segurado seguradoBuscado = SeguradoController.localizarPorRg(segurados, rgBuscado);

    if(seguradoBuscado == null) {
      SeguradoView.seguradoNaoLocalizado();
      return null;
    }

    SeguroVida seguroVida = new SeguroVida();
    seguroVida.setApolice(Console.readString("Digite o número da apólice: "));
    seguroVida.setSegurado(seguradoBuscado);
    seguroVida.setVlrApolice(Console.readDouble("Digite o valor da apólice: "));
    seguroVida.setDtaInicio(Console.readString("Data Início: "));
    seguroVida.setDtaFim(Console.readString("Data do Fim: "));

    int cobreDoenca;
    do {
      cobreDoenca = Console.readInt("Apólice Cobre Doença (1 - SIM/ 0 - NÃO): ");
      
      if (cobreDoenca != 1 && cobreDoenca != 0) {
        ErroView.opcaoInvalida();
      }
    } while (cobreDoenca != 1 && cobreDoenca != 0);
    
    if (cobreDoenca == 1) {
      seguroVida.setCobreDoenca(true);
    } else {
      seguroVida.setCobreDoenca(false);
    }
    
    int cobreApolice;
    do {
      cobreApolice = Console.readInt("Apólice Cobre Acidente (1 - SIM/ 0 - NÃO): ");
      
      if (cobreApolice != 1 && cobreApolice != 0) {
        ErroView.opcaoInvalida();
      }
    } while (cobreApolice != 1 && cobreApolice != 0);
    
    if (cobreApolice == 1) {
      seguroVida.setCobreAcidente(true);
    } else {
      seguroVida.setCobreAcidente(false);
    }
    

    adicionadoSucesso(seguroVida);

    return seguroVida;
  }

  public static void visualizar(SeguroVida seguroVida) {
    System.out.println("\nNome: " + seguroVida.getApolice());

    System.out.println("Apólice: " + seguroVida.getVlrApolice());

    Segurado segurado = seguroVida.getSegurado();
    System.out.println(" Segurado: { ");
    System.out.println("  Rg: " + segurado.getRg());
    System.out.println("  CPF: " + segurado.getCpf());
    System.out.println("  Gênero: " + segurado.getGenero());
    System.out.println("  Telefone: " + segurado.getTelefone());
    System.out.println("  Endereço: " + segurado.getEndereco());
    System.out.println("  CEP: " + segurado.getCep());
    System.out.println(" }");

    System.out.println("Data do Início: " + seguroVida.getDtaInicio());
    System.out.println("Data do Fim: " + seguroVida.getDtaFim());
    System.out.println("Cobre Doença: " + seguroVida.isCobreDoenca());
    System.out.println("Cobre Acidente: " + seguroVida.isCobreAcidente());
    System.out.println("*********************");
  }

  public static void adicionadoSucesso(SeguroVida seguroVida) {
    System.out.println("\nSeguro de vida com a apólice " + seguroVida.getApolice() + " adicionado com sucesso!\n");
    visualizar(seguroVida);
  }
}
package br.edu.up.view;

import br.edu.up.model.Console;

public class MenuView {
  public static int principal() {
    System.out.println("\n---------- Menu Principal ----------");
    System.out.println("1 - Segurado");
    System.out.println("2 - Seguro");
    System.out.println("0 - Sair");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int segurado() {
    System.out.println("\n---------- Menu Segurado ----------");
    System.out.println("1 - Incluir Segurado");
    System.out.println("2 - Localizar Segurados");
    System.out.println("3 - Excluir Segurado");
    System.out.println("0 - Voltar");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int localizarSegurados() {
    System.out.println("\n---------- Localizar Segurado ----------");
    System.out.println("1 - Por RG");
    System.out.println("2 - Visualizar todos segurados");
    System.out.println("0 - Voltar");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int seguro() {
    System.out.println("\n---------- Menu Seguro ----------");
    System.out.println("1 - Incluir Seguro");
    System.out.println("2 - Localizar Seguros");
    System.out.println("3 - Excluir Seguro");
    System.out.println("4 - Ver quantidade de seguros");
    System.out.println("0 - Sair");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int incluirSeguro() {
    System.out.println("\n---------- Incluir Seguro ----------");
    System.out.println("1 - Seguro de Vida");
    System.out.println("2 - Seguro de Automóvel");
    System.out.println("0 - Voltar");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int localizarSeguros() {
    System.out.println("\n---------- Localizar Seguro ----------");
    System.out.println("1 - Por Apólice");
    System.out.println("0 - Voltar");

    return Console.readInt("\nInforme a opção: ");
  }

  public static int excluirSeguro() {
    System.out.println("\n---------- Excluir Seguro ----------");
    System.out.println("1 - Por Apólice");
    System.out.println("2 - Excluir todos seguros");
    System.out.println("0 - Voltar");

    return Console.readInt("\nInforme a opção: ");
  }
}
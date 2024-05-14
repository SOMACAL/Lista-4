package br.edu.up.view;

import br.edu.up.model.Console;

public class Menu {
  public static int principal() {
    System.out.println("\n----------Menu Trafégo Aéreo----------");
    System.out.println("1- Registrar Informações");
    System.out.println("2- Visualizar Informações");
    System.out.println("3- Adicionar a Aeronave");
    System.out.println("0- Encerrar");

    return Console.readInt("\nInforme a opção desejada: ");
  }

  public static int registrar() {
    System.out.println("\n----------Menu Registro----------");
    System.out.println("1- Registrar Tripulante");
    System.out.println("2- Registrar Passagem");
    System.out.println("3- Registrar Passageiro");
    System.out.println("4- Registrar Comandante");
    System.out.println("5- Registrar Aeronave");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opção desejada: ");
  }

  public static int visualizar() {
    System.out.println("\n----------Menu Visualização----------");
    System.out.println("1- Visualizar Tripulantes");
    System.out.println("2- Visualizar Passagens");
    System.out.println("3- Visualizar Passageiros");
    System.out.println("4- Visualizar Comandantes");
    System.out.println("5- Visualizar Aeronaves");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opção desejada: ");
  }

  public static int aeronave() {
    System.out.println("\n----------Menu Aeronave----------");
    System.out.println("1- Adicionar Tripulantes");
    System.out.println("2- Adicionar Passageiros");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opção desejada: ");
  }
}

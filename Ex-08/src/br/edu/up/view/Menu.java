package br.edu.up.view;

import br.edu.up.model.Console;

public class Menu {
  public static int principal() {
    System.out.println("\n----------Agenda de Contato----------");
    System.out.println("1- Adicionar Contatos");
    System.out.println("2- Excluir Contatos");
    System.out.println("3- Mostrar Contatos");
    System.out.println("0- Sair");

    return Console.readInt("\nInforme a opcão desejada: ");
  }

  public static int subMenu() {
    System.out.println("1- Pessoal");
    System.out.println("2- Comercial");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opcão desejada: ");
  }

  public static int subMenuMostrar() {
    System.out.println("1- Mostrar todos os contatos");
    System.out.println("2- Mostrar um contato");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opcão desejada: ");
  }

  public static int subMenuMostrarTodos() {
    System.out.println("\n----------Mostrar Todos Contatos----------");
    System.out.println("1- Todos Contatos");
    System.out.println("2- Pessoal");
    System.out.println("3- Comercial");
    System.out.println("0- Voltar");

    return Console.readInt("\nInforme a opcão desejada: ");
  }

  public static int adicionar() {
    System.out.println("\n----------Adicionar Contatos----------");
    return subMenu();
  }

  public static int excluir() {
    System.out.println("\n----------Excluir Contatos----------");
    return ContatoView.codigo();
  }

  public static int buscar() {
    System.out.println("\n----------Buscar Contatos----------");
    return subMenu();
  }

  public static int mostrar() {
    System.out.println("\n----------Mostrar Contatos----------");
    return subMenuMostrar();
  }
}

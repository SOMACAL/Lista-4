package br.edu.up.view;

import java.util.ArrayList;

import br.edu.up.model.Console;
import br.edu.up.model.Modelos.Comandante;

public class ComandanteView {
  public static Comandante criarComandante() {
    Comandante comandante = new Comandante();
    ArrayList<String> idiomas = comandante.getIdiomas();

    System.out.println("\n----------Criar Comandante----------");
    comandante.setNome(Console.readString("Informe o nome: "));
    comandante.setRg(Console.readString("Informe o rg: "));
    comandante.setTotalHoraVoo(Console.readDouble("Informe o total de horas de vôo: "));

    String idioma = "";
    System.out.println("Pressione '0' para sair.");
    while (!idioma.equals("0")) {
      idioma = Console.readString("Informe os idiomas falados: ");

      if (!idioma.equals("0")) {
        idiomas.add(idioma);
      }
    }

    comandante.setIdiomas(idiomas);

    return comandante;
  }

  public static void visualizarComandantes(Comandante comandante) {
    System.out.println("\nNome: " + comandante.getNome());
    System.out.println("Rg: " + comandante.getRg());
    System.out.println("Total Horas de Vôo: " + comandante.getTotalHoraVoo());

    ArrayList<String> idiomas = comandante.getIdiomas();

    System.out.println("Idiomas: {");
    for (String idioma : idiomas) {
      System.out.println(" -" + idioma);
    }
    System.out.println("}");
    System.out.println("**********************");
  }

  public static void visualizarComandantesMenu() {
    System.out.println("\n----------Comandantes----------");
  }

  public static void comandanteAddSucesso(Comandante comandante) {
    System.out.println("\nComandante " + comandante.getNome() + " adicionado com sucesso.");

    System.out.println("\nTripulante: " + comandante.getNome() + "\nRg: " + comandante.getRg() + "\nTotal Horas vôo: "
        + comandante.getTotalHoraVoo() + "\nIdiomas: {");

    ArrayList<String> idiomas = comandante.getIdiomas();

    for (String idioma : idiomas) {
      System.out.println(" - " + idioma);
    }
    System.out.println("}");
  }

  public static void comandanteInvalido(String rg) {
    System.out.println("\nComandante com o rg: " + rg + " não consta no sistema.");
  }

  public static void mostrarMensagemSemComandantes() {
    System.out.println("\nNão há comandantes para ser mostrado.");
  }
}

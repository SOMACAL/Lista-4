package br.edu.up.view;

import br.edu.up.model.Console;

public class SeguroView {
  public static void seguroJaIncluso() {
    System.out.println("\nSeguro já consta no sistema!");
  }

  public static void seguroRemovido() {
    System.out.println("\nSeguro removido com sucesso!");
  }

  public static void segurosRemovido() {
    System.out.println("\nSeguros removido com sucesso!");
  }

  public static void seguroNaoEncontrado() {
    System.out.println("\nSeguro não encontrado!");
  }

  public static void qtdSeguros(int qtdSeguros) {
    System.out.println("\nA quantidade total de seguros é de: " + qtdSeguros);
  }

  public static String informeApolice() {
    return Console.readString("Informe a apolice: ");
  }
}

package br.edu.up.view;

import br.edu.up.model.Console;

public class ContatoView {
  public static int codigo() {
    return Console.readInt("Informe o código do contato: ");
  }

  public static void contatoRemovidoSucesso(int codigo) {
    System.out.println("\nContato com o código " + codigo + " removido com sucesso");
  }

  public static void contatoNaoEncontrado(int codigo) {
    System.out.println("Contato com o código " + codigo + " não encontrado.");
  }

  public static void contatoRemovidoFalha(int codigo) {
    System.out.println("\nFalha ao remover contato. O contato com o id: " + codigo + "não consta no sistema.");
  }
}

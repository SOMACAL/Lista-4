package br.edu.up.view;

import br.edu.up.model.Livro;

public class LivroView {
  public static void visualizar(Livro livro, String[] autores) {
    System.out.println("\n");
    System.out.println("Livro: " + livro.getTitulo());
    System.out.println("Código: " + livro.getCodigo());
    System.out.print("Autores: ");
    for (String autor : autores) {
      System.out.print(autor + ", ");
    }
    System.out.println("\nISBN: " + livro.getISBN());
    System.out.println("Ano: " + livro.getAno());
  }
}

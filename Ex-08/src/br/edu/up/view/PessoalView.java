package br.edu.up.view;

import br.edu.up.model.Console;
import br.edu.up.model.modelos.Pessoal;

public class PessoalView {

  public static Pessoal adicionar() {
    System.out.println("\n---------Adicionar Contato Pessoal---------");

    Pessoal pessoal = new Pessoal();

    pessoal.setCodigo(Console.readInt("Informe o código: "));
    pessoal.setNome(Console.readString("Informe o nome: "));
    pessoal.setTelefone(Console.readString("Informe o telefone: "));
    pessoal.setAniversario(Console.readString("Informe o aniversário: "));

    return pessoal;
  }

  public static void visualizar(Pessoal pessoal) {
    System.out.println("\nCódigo do Contato: " + pessoal.getCodigo());
    System.out.println("Nome: " + pessoal.getNome());
    System.out.println("Telefone: " + pessoal.getTelefone());
    System.out.println("Aniversário: " + pessoal.getAniversario());
    System.out.println("********************");
  }

  //Avisos
  public static void contatoAddSucesso(Pessoal pessoal) {
    System.out.println("\nContato adicionado com sucesso");
    visualizar(pessoal);
  }
}

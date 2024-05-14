package br.edu.up.view;

import br.edu.up.model.Console;
import br.edu.up.model.modelos.Comercial;

public class ComercialView {

  public static Comercial adicionar() {
    System.out.println("\n---------Adicionar Contato Pessoal---------");

    Comercial comercial = new Comercial();

    comercial.setCodigo(Console.readInt("Informe o código: "));
    comercial.setNome(Console.readString("Informe o nome: "));
    comercial.setTelefone(Console.readString("Informe o telefone: "));
    comercial.setCnpj(Console.readString("Informe o cnpj: "));

    return comercial;
  }

  public static void visualizar(Comercial comercial) {
    System.out.println("\nCódigo do Contato: " + comercial.getCodigo());
    System.out.println("Nome: " + comercial.getNome());
    System.out.println("Telefone: " + comercial.getTelefone());
    System.out.println("Cnpj: " + comercial.getCnpj());
    System.out.println("********************");
  }

  //Avisos
  public static void contatoAddSucesso(Comercial comercial) {
    System.out.println("\nContato adicionado com sucesso");
    visualizar(comercial);
  }
}

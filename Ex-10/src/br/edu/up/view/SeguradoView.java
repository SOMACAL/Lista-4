package br.edu.up.view;

import br.edu.up.model.Console;
import br.edu.up.model.modelo.EnumGenero;
import br.edu.up.model.modelo.Segurado;

public class SeguradoView {
  public static Segurado adicionar() {
    Segurado segurado = new Segurado();

    segurado.setNome(Console.readString("Digite o nome: "));
    segurado.setCpf(Console.readString("Digite o CPF: "));
    String genero = Console.readString("Digite o gênero (Masculino/Feminino/Outro): ");

    if (genero.equalsIgnoreCase("Masculino")) {
      segurado.setGenero(EnumGenero.MASCULINO);
    } else if (genero.equalsIgnoreCase("Feminino")) {
      segurado.setGenero(EnumGenero.FEMININO);
    } else {
      segurado.setGenero(EnumGenero.OUTRO);
    }

    segurado.setTelefone(Console.readString("Digite o telefone: "));
    segurado.setEndereco(Console.readString("Digite o endereço: "));
    segurado.setCep(Console.readString("Digite o CEP: "));
    segurado.setCidade(Console.readString("Digite a cidade: "));

    return segurado;
  }

  public static void visualizar(Segurado segurado) {
    System.out.println("\nNome: " + segurado.getNome());
    System.out.println("Rg: " + segurado.getRg());
    System.out.println("CPF: " + segurado.getCpf());
    System.out.println("Gênero: " + segurado.getGenero());
    System.out.println("Telefone: " + segurado.getTelefone());
    System.out.println("Endereço: " + segurado.getEndereco());
    System.out.println("CEP: " + segurado.getCep());
    System.out.println("Cidade: " + segurado.getCidade());
    System.out.println("*********************");
  }

  public static void adicionadoSucesso(Segurado segurado) {
    System.out.println("\nSegurado adicionado com sucesso!\n");
    visualizar(segurado);
  }

  public static String localizarRg() {
    return Console.readString("Digite o RG: ");
  }

  public static void seguradoJaCadastrado() {
    System.out.println("\nSegurado já cadastrado!");
  }

  public static void seguradoExcluido(String rg) {
    System.out.println("\nSegurado com o RG: " + rg + " excluido com sucesso!");
  }

  public static void seguradoNaoLocalizado() {
    System.out.println("\nSegurado não localizado!");
  }
}

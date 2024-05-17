package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.model.Compromisso;

public class CompromissoView {
  public static Compromisso incluir() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n");
    System.out.println("Digite o nome da pessoa relacionada ao compromisso: ");
    String pessoa = scanner.nextLine();

    System.out.println("Digite o local do compromisso:");
    String local = scanner.nextLine();

    System.out.println("Digite o assunto do compromisso:");
    String assunto = scanner.nextLine();

    System.out.println("Digite a hora do compromisso:");
    int hora = scanner.nextInt();

    Compromisso compromisso = new Compromisso();
    compromisso.setPessoa(pessoa);
    compromisso.setLocal(local);
    compromisso.setAssunto(assunto);
    compromisso.setHora(hora);
    scanner.close();
    return compromisso;
  }

  public static void visualizar(Compromisso compromisso) {
    System.out.println("\nCompromisso criado:");
    System.out.println("Pessoa: " + compromisso.getPessoa());
    System.out.println("Local: " + compromisso.getLocal());
    System.out.println("Assunto: " + compromisso.getAssunto());
    System.out.println("Hora: " + compromisso.getHora() + "h");
  }
}

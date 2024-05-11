package br.edu.up;
import br.edu.up.model.Compromisso;





import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Digite o nome da pessoa relacionada ao compromisso:");
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

        System.out.println("Compromisso criado:");
        System.out.println("Pessoa: " + compromisso.getPessoa());
        System.out.println("Local: " + compromisso.getLocal());
        System.out.println("Assunto: " + compromisso.getAssunto());
        System.out.println("Hora: " + compromisso.getHora() + "h");

        scanner.close();
    }
}

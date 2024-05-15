package br.edu.up.view;

import java.util.Scanner;

public class ClienteView {
    private Scanner scanner;

    public ClienteView() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("\n");
        System.out.println("Menu:");
        System.out.println("1. Incluir cliente pessoa");
        System.out.println("2. Incluir cliente empresa");
        System.out.println("3. Mostrar dados cliente pessoa");
        System.out.println("4. Mostrar dados cliente empresa");
        System.out.println("5. Emprestar para cliente pessoa");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String[] cadastrarCliente() {
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        return new String[]{nome, endereco};
    }

    public double getValorEmprestimo() {
        System.out.print("Valor do empréstimo: ");
        return scanner.nextDouble();
    }

    public void mostrarDadosCliente(String nome, String endereco, double vlrEmprestado) {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor emprestado: " + vlrEmprestado);
    }

    public void showMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}

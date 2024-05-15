package br.edu.up.view;

import br.edu.up.Controller.EventoController;
import br.edu.up.model.Evento;

import java.time.LocalDate;
import java.util.Scanner;

public class EventoReservaView {
    private EventoController eventoController;
    private Scanner scanner;

    public EventoReservaView(EventoController eventoController) {
        this.eventoController = eventoController;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n### Menu de Eventos ###");
            System.out.println("1 - Adicionar Evento");
            System.out.println("2 - Listar Eventos");
            System.out.println("3 - Excluir Evento");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarEvento();
                    break;
                case 2:
                    listarEventos();
                    break;
                case 3:
                    excluirEvento();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void adicionarEvento() {
        System.out.println("\n### Adicionar Evento ###");
        System.out.print("Digite o nome do evento: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a data do evento (yyyy-mm-dd): ");
        LocalDate data = LocalDate.parse(scanner.nextLine());
        System.out.print("Digite o local do evento: ");
        String local = scanner.nextLine();
        System.out.print("Digite a lotação máxima do evento: ");
        int lotacaoMaxima = scanner.nextInt();
        System.out.print("Digite o preço do ingresso: ");
        double precoIngresso = scanner.nextDouble();

        eventoController.adicionarEvento(nome, data, local, lotacaoMaxima, precoIngresso);
        System.out.println("Evento adicionado com sucesso!");
    }

    private void listarEventos() {
        System.out.println("\n### Listar Eventos ###");
        eventoController.listarEventos().forEach(System.out::println);
    }

    private void excluirEvento() {
        System.out.println("\n### Excluir Evento ###");
        listarEventos();
        System.out.print("Digite o índice do evento a ser excluído: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Evento evento = eventoController.listarEventos().get(indice);
        eventoController.excluirEvento(evento);
        System.out.println("Evento excluído com sucesso!");
    }
}

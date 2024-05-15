package br.edu.up;

import br.edu.up.controller.AcademicoController;
import br.edu.up.view.AcademicoView;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AcademicoController controller = new AcademicoController();
        AcademicoView view = new AcademicoView(controller);
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            int opcao = view.exibirMenu(scanner);

            switch (opcao) {
                case 1:
                    view.adicionarDisciplina();
                    break;
                case 2:
                    view.adicionarAluno();
                    break;
                case 3:
                    view.adicionarCompetenciaNecessaria();
                    break;
                case 4:
                    view.adicionarCompetenciaComplementar();
                    break;
                case 5:
                    view.listarDisciplinas();
                    break;
                case 0:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }
}

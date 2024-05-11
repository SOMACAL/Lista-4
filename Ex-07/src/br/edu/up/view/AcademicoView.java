package br.edu.up.view;

import br.edu.up.controller.AcademicoController;
import br.edu.up.model.Competencia;
import br.edu.up.model.Aluno;
import br.edu.up.model.TipoCompetencia;
import br.edu.up.model.Disciplina;

import java.util.List;
import java.util.Scanner;

public class AcademicoView {
    private AcademicoController controller;

    public AcademicoView(AcademicoController controller) {
        this.controller = controller;
    }

    public int exibirMenu(Scanner scanner) {
        System.out.println("\n### Sistema Acadêmico ###");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar disciplina");
        System.out.println("2 - Adicionar aluno");
        System.out.println("3 - Adicionar competência necessária");
        System.out.println("4 - Adicionar competência complementar");
        System.out.println("5 - Listar disciplinas");
        System.out.println("0 - Sair");

        return scanner.nextInt();
    }

    public void adicionarDisciplina() {
        // Lógica para adicionar disciplina
    }

    public void adicionarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o identificador da disciplina:");
        String identificadorDisciplina = scanner.nextLine();

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite o RG do aluno:");
        String rg = scanner.nextLine();
        System.out.println("Digite a matrícula do aluno:");
        String matricula = scanner.nextLine();
        System.out.println("Digite o ano de ingresso do aluno:");
        int anoIngresso = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Digite o curso do aluno:");
        String curso = scanner.nextLine();
        System.out.println("Digite o turno do aluno:");
        String turno = scanner.nextLine();

        Aluno aluno = new Aluno(nome, rg, matricula, anoIngresso, curso, turno);
        controller.adicionarAluno(identificadorDisciplina, aluno);
    }

    public void adicionarCompetenciaNecessaria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o identificador da disciplina:");
        String identificadorDisciplina = scanner.nextLine();

        System.out.println("Digite o nome da competência necessária:");
        String nome = scanner.nextLine();
        System.out.println("A competência é atingida? (true/false)");
        boolean atingida = scanner.nextBoolean();
        scanner.nextLine(); // Limpar o buffer do scanner

        Competencia competencia = new Competencia(nome, TipoCompetencia.NECESSARIA, atingida);
        controller.adicionarCompetenciaNecessaria(identificadorDisciplina, competencia);
    }

    public void adicionarCompetenciaComplementar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o identificador da disciplina:");
        String identificadorDisciplina = scanner.nextLine();

        System.out.println("Digite o nome da competência complementar:");
        String nome = scanner.nextLine();
        System.out.println("A competência é atingida? (true/false)");
        boolean atingida = scanner.nextBoolean();
        scanner.nextLine(); // Limpar o buffer do scanner

        Competencia competencia = new Competencia(nome, TipoCompetencia.COMPLEMENTAR, atingida);
        controller.adicionarCompetenciaComplementar(identificadorDisciplina, competencia);
    }

    public void listarDisciplinas() {
        List<Disciplina> disciplinas = controller.listarDisciplinas();
        if (disciplinas.isEmpty()) {
            System.out.println("Não há disciplinas cadastradas.");
        } else {
            System.out.println("Disciplinas cadastradas:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(disciplina.getNome());
            }
        }
    }
}


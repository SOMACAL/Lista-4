package br.edu.up.view;

import br.edu.up.model.Console;
import br.edu.up.model.Modelos.Tripulacao;

public class TripulanteView {
  public static Tripulacao criarTripulante() {
    Tripulacao tripulante = new Tripulacao();

    System.out.println("\n----------Criar Tripulante----------");
    tripulante.setNome(Console.readString("Informe o nome: "));
    tripulante.setRg(Console.readString("Informe o rg: "));
    tripulante.setIdAeronautica(Console.readString("Informe o Id da Aeronautica: "));
    tripulante.setMatricula(Console.readString("Informe a matricula: "));

    return tripulante;
  }

  public static void visualizarTripulantes(Tripulacao tripulante) {
    System.out.println("\nNome: " + tripulante.getNome());
    System.out.println("Rg: " + tripulante.getRg());
    System.out.println("Id Aeronautica: " + tripulante.getIdAeronautica());
    System.out.println("Matricula: " + tripulante.getMatricula());
    System.out.println("**********************");
  }

  public static void visualizarTriuplantesMenu() {
    System.out.println("\n----------Tripulantes----------");
  }

  public static void tripulanteAddSucesso(Tripulacao tripulante) {
    System.out.println("\nTripulante " + tripulante.getNome() + " adicionado com sucesso.");

    System.out.println("\nTripulante: " + tripulante.getNome() + "\nRg: " + tripulante.getRg() + "\nId Aeronautica: "
        + tripulante.getIdAeronautica() + "\nMatricula: " + tripulante.getMatricula());
  }

  public static void tripulanteInvalido(String matricula) {
    System.out.println("\nTripulante com a matricula: " + matricula + " não consta no sistema.");
  }

  public static void mostrarMensagemSemTripulantes() {
    System.out.println("\nNão há tripulantes para ser mostrado.");
  }
}

package br.edu.up.view;

import br.edu.up.controller.PassagemController;
import br.edu.up.model.Console;
import br.edu.up.model.Modelos.DataVoo;
import br.edu.up.model.Modelos.Passagem;

public class PassagemView {
  static PassagemController passagemController = new PassagemController();

  public static Passagem criarPassagem() {
    Passagem passagem = new Passagem();
    DataVoo dataVoo = new DataVoo();

    System.out.println("\n----------Criar Passagem----------");
    passagem.setId(Console.readInt("Informe o id da passagem: "));
    passagem.setClasse(Console.readString("Informe a classe: "));
    passagem.setNumAcento(Console.readString("Informe o número do acento: "));
    dataVoo.setDia(Console.readString("Informe o dia do voo: "));
    dataVoo.setMes(Console.readString("Informe o mês do voo: "));
    dataVoo.setAno(Console.readString("Informe o ano do voo: "));
    dataVoo.setHora(Console.readString("Informe a hora do voo: "));

    passagem.setDataVoo(dataVoo);

    return passagem;
  }

  public static void visualizarPassagens(Passagem passagem) {
    System.out.println("\nId Bagagem: " + passagem.getId());
    System.out.println("Classe: " + passagem.getClasse());
    System.out.println("Número Acento: " + passagem.getNumAcento());
    System.out.println("Dia Vôo: " + passagem.getDataVoo().getDia() + "/" + passagem.getDataVoo().getMes() + "/"
        + passagem.getDataVoo().getAno());
    System.out.println("Hora Vôo: " + passagem.getDataVoo().getHora());
    System.out.println("**********************");
  }

  public static void visualizarPassagemMenu() {
    System.out.println("\n----------Passagens----------");
  }

  public static void passagemAddSucesso(Passagem passagem) {
    System.out.println("\nPassagem " + passagem.getId() + " criada com sucesso.");

    System.out.println("\nId: " + passagem.getId() + "\nClasse: " + passagem.getClasse() + "\nNúmero Acento: "
        + passagem.getNumAcento() + "\nDia Voo: " + passagem.getDataVoo().getDia() + "/"
        + passagem.getDataVoo().getMes() + passagem.getDataVoo().getAno() + "\nHora Vôo: "
        + passagem.getDataVoo().getHora());
  }

  public static void passagemInvalida(int idPassagem) {
    System.out.println("\nPassagem com o id: " + idPassagem + " não consta no sistema.");
  }

  public static void mostrarMensagemSemPassagem() {
    System.out.println("\nNão há passagens para ser mostrada.");
  }
}

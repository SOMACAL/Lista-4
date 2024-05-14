package br.edu.up.view;

import br.edu.up.App;
import br.edu.up.controller.PassagemController;
import br.edu.up.model.Console;
import br.edu.up.model.Listas.ListaPassagens;
import br.edu.up.model.Modelos.Passageiro;
import br.edu.up.model.Modelos.Passagem;

public class PassageiroView {
  static PassagemController passagemController = new PassagemController();

  public static Passageiro criarPassageiro() {
    Passageiro passageiro = new Passageiro();
    ListaPassagens passageiros = App.passagens;

    System.out.println("\n----------Adicionar Passageiro----------");
    passageiro.setNome(Console.readString("Informe o nome: "));
    passageiro.setRg(Console.readString("Informe o rg: "));
    passageiro.setIdBagagem(Console.readString("Informe o id da bagagem: "));

    int idPassagem = Console.readInt("Informe o número do id da passsagem: ");

    Passagem passagemBuscada = passagemController.buscarPassagem(passageiros, idPassagem);

    if (passagemBuscada == null) {
      PassagemView.passagemInvalida(idPassagem);
      return null;
    }

    passageiro.setPassagem(passagemBuscada);

    return passageiro;
  }

  public static void visualizarPassageiros(Passageiro passageiro, Passagem passagem) {
    System.out.println("\nNome: " + passageiro.getNome());
    System.out.println("Rg: " + passageiro.getRg());
    System.out.println("Id Bagagem: " + passageiro.getIdBagagem());
    System.out.println("Id Passagem: " + passagem.getId());
    System.out.println("Classe: " + passagem.getClasse());
    System.out.println("Número do Acento: " + passagem.getNumAcento());
    System.out.println("Dia Vôo: " + passagem.getDataVoo().getDia() + "/" + passagem.getDataVoo().getMes() + "/"
        + passagem.getDataVoo().getAno());
    System.out.println("Hora Vôo: " + passagem.getDataVoo().getHora());
    System.out.println("**********************");
  }

  public static void visualizarPassageirosMenu() {
    System.out.println("\n----------Passageiros----------");
  }

  public static void passageiroAddSucesso(Passageiro passageiro, int idPassagem) {
    System.out.println("\nPassageiro " + passageiro.getNome() + " adicionado com sucesso.");

    Passagem passagem = passagemController.buscarPassagem(App.passagens, idPassagem);

    System.out.println("\nTripulante: " + passageiro.getNome() + "\nRg: " + passageiro.getRg() + "\nId Bagagem: "
        + passageiro.getIdBagagem() + "\nId passagem: " + passagem.getId() + "\nClasse: " + passagem.getClasse()
        + "\nNúmero Acento: " + passagem.getNumAcento() + "\nDia Voo: " + passagem.getDataVoo().getDia() + "/"
        + passagem.getDataVoo().getMes() + passagem.getDataVoo().getAno() + "\nHora Vôo: "
        + passagem.getDataVoo().getHora());
  }

  public static void passageiroInvalido(String rg) {
    System.out.println("\nPassageiro com o RG: " + rg + " não consta no sistema.");
  }

  public static void mostrarMensagemSemPassageiros() {
    System.out.println("\nNão há passageiros para ser mostrado.");
  }
}

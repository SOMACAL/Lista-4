package br.edu.up.view;

import java.util.ArrayList;
import br.edu.up.App;
import br.edu.up.controller.ComandanteController;
import br.edu.up.controller.PassageiroController;
import br.edu.up.controller.TripulanteController;
import br.edu.up.model.Console;
import br.edu.up.model.Modelos.Aeronave;
import br.edu.up.model.Modelos.Comandante;
import br.edu.up.model.Modelos.DataVoo;
import br.edu.up.model.Modelos.Tripulacao;
import br.edu.up.model.Modelos.Passageiro;
import br.edu.up.model.Modelos.Passagem;

public class AeronaveView {
  static ComandanteController comandanteController = new ComandanteController();
  static TripulanteController tripulanteController = new TripulanteController();
  static PassageiroController passageiroController = new PassageiroController();

  public static Aeronave criAeronave() {
    Aeronave aeronave = new Aeronave();

    System.out.println("\n----------Criar Aeronave----------");
    aeronave.setCodVoo(Console.readString("Informe o código de vôo: "));
    aeronave.setTipoVoo(Console.readString("Informe o tipo de vôo: "));

    String rgComandante = Console.readString("Informe o RG do comandante: ");

    Comandante comandanteBuscado = comandanteController.buscarComandante(App.comandantes, rgComandante);

    if (comandanteBuscado == null) {
      ComandanteView.comandanteInvalido(rgComandante);
      return null;
    }

    aeronave.setComandante(comandanteBuscado);

    return aeronave;
  }

  public static void visualizarAeronaves(Aeronave aeronave) {
    System.out.println("\nAeronave: " + aeronave.getCodVoo());
    System.out.println("Código de Vôo: " + aeronave.getCodVoo());
    System.out.println("Quantidade de Acentos: " + aeronave.getQtdAcentos());

    Comandante comandante = aeronave.getComandante();

    System.out.println("Comandante: { ");
    System.out.println(" - Nome: " + comandante.getNome());
    System.out.println(" - Rg: " + comandante.getRg());
    System.out.println(" - Total Horas de Vôo: " + comandante.getTotalHoraVoo());

    ArrayList<String> idiomas = comandante.getIdiomas();

    System.out.println(" - Idiomas: { ");

    for (String idioma : idiomas) {
      System.out.println("  - " + idioma);
    }
    System.out.println("   } ");
    System.out.println("} ");

    System.out.println("Capacidade máxima da tripulacao: " + aeronave.capacidadeMaximaTripulantes());

    System.out.println("Capacidade máxima de passageiros: " + aeronave.capacidadeMaximaPassageiros());

    ArrayList<Tripulacao> tripulantes = aeronave.getTripulantes();

    if (tripulantes.size() == 0) {
      return;
    }

    System.out.println("\nTripulantes: ");

    for (Tripulacao tripulante : tripulantes) {
      System.out.println("Nome: " + tripulante.getNome());
      System.out.println("Rg: " + tripulante.getRg());
      System.out.println("Id Aeronautioca: " + tripulante.getIdAeronautica());
      System.out.println("Matricula: " + tripulante.getMatricula());
    }
    System.out.println("*********************\n");

    ArrayList<Passageiro> passageiros = aeronave.getPassageiros();

    if (passageiros.size() == 0) {
      return;
    }

    System.out.println("\nPassageiros: ");

    for (Passageiro passageiro : passageiros) {
      System.out.println("Nome: " + passageiro.getNome());
      System.out.println("Rg: " + passageiro.getRg());
      System.out.println("Id Bagagem: " + passageiro.getIdBagagem());

      Passagem passagem = passageiro.getPassagem();
      System.out.println("Passagem: {");
      System.out.println("Id: " + passagem.getId());
      System.out.println("Classe: " + passagem.getClasse());
      System.out.println("Número do Acento: " + passagem.getNumAcento());

      DataVoo dataVoo = passagem.getDataVoo();
      System.out.println("Dia do Voo" + dataVoo.getDia() + "/" + dataVoo.getMes() + "/" + dataVoo.getAno());
      System.out.println("Hora Voo" + dataVoo.getHora());
      System.out.println(" }");
    }
    System.out.println("*********************\n");

  }

  public static void visualizarAeronavesMenu() {
    System.out.println("\n----------Aeronaves----------");
  }

  public static void aeronaveAddSucesso(Aeronave aeronave) {
    System.out.println("\nAeronave: " + aeronave.getCodVoo() + " criada com sucesso.");
    System.out.println("\n********************");
    System.out.println("Código de Vôo: " + aeronave.getCodVoo());
    System.out.println("Tipo de Vôo: " + aeronave.getTipoVoo());
    System.out.println("Quantida de Acentos: " + aeronave.getQtdAcentos());

    Comandante comandante = aeronave.getComandante();
    System.out.println("Comandante: { ");
    System.out.println(" - Nome: " + comandante.getNome());
    System.out.println(" - Rg: " + comandante.getRg());
    System.out.println(" - Total Horas de Vôo: " + comandante.getTotalHoraVoo());

    ArrayList<String> idiomas = comandante.getIdiomas();

    System.out.println(" - Idiomas: { ");

    for (String idioma : idiomas) {
      System.out.println("   - " + idioma);
    }
    System.out.println("  } ");
    System.out.println(" } ");

    System.out.println("Capacidade de tripulacao: " + aeronave.capacidadeMaximaTripulantes());
    System.out.println("Capacidade de passageiros: " + aeronave.capacidadeMaximaPassageiros());
    System.out.println("********************");
  }

  public static void aeronaveInvalida(String codVoo) {
    System.out.println("\nNão há aeronaves cadastradas com o código de vôo " + codVoo + '.');
  }

  public static void mostrarMensagemSemAeronave() {
    System.out.println("\nNão há aeronaves para ser mostrada.");
  }

  public static void capacidadeMaxTripulantes() {
    System.out.println("Capacidade máxima de tripulantes excedida.");
  }

  public static void capacidadeMaxPassageiros() {
    System.out.println("Capacidade máxima de passageiros excedida.");
  }

  public static String informarAeronave() {
    return Console.readString("Informe o código do Vôo: ");
  }

  public static String informarTripulante() {
    return Console.readString("Informe a matricula do Tripulante: ");
  }

  public static String informarPassageiro() {
    return Console.readString("Informe o RG do passageiro: ");
  }
}

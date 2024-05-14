package br.edu.up.controller;

import java.util.ArrayList;
import br.edu.up.App;
import br.edu.up.model.Listas.ListaAeronaves;
import br.edu.up.model.Modelos.Aeronave;
import br.edu.up.model.Modelos.Passageiro;
import br.edu.up.model.Modelos.Passagem;
import br.edu.up.model.Modelos.Tripulacao;
import br.edu.up.view.AeronaveView;
import br.edu.up.view.PassageiroView;
import br.edu.up.view.TripulanteView;

public class AeronoveController {

  public static Aeronave buscarAeronave(ListaAeronaves aeronaves, String codVoo) {
    for (Aeronave aeronave : aeronaves) {
      if (aeronave.getCodVoo().equals(codVoo)) {
        return aeronave;
      }
    }
    return null;
  }

  public static void addTripulanteAeronave(String codigoVoo, String matricula) {
    TripulanteController tripulanteController = new TripulanteController();
    ArrayList<Tripulacao> tripulantes = App.tripulantes.getTripulantes();

    if (tripulantes.size() > 5) {
      AeronaveView.capacidadeMaxTripulantes();
      return;
    }

    Tripulacao tripulanteBuscado = tripulanteController.buscarTripulante(App.tripulantes, matricula);

    if (tripulanteBuscado == null) {
      TripulanteView.tripulanteInvalido(matricula);
      return;
    }

    Aeronave aeronaveBuscada = buscarAeronave(App.aeronaves, codigoVoo);

    if (aeronaveBuscada == null) {
      AeronaveView.aeronaveInvalida(codigoVoo);
      return;
    }

    aeronaveBuscada.getTripulantes().add(tripulanteBuscado);
    TripulanteView.tripulanteAddSucesso(tripulanteBuscado);
  }

  public static void addPassageiroAeronave(String codigoVoo, String rg) {
    PassageiroController passageiroController = new PassageiroController();
    ArrayList<Passageiro> passageiros = App.passageiros.getPassageiros();

    if (passageiros.size() > 200) {
      AeronaveView.capacidadeMaxPassageiros();
      return;
    }

    Passageiro passageiroBuscado = passageiroController.buscarPassageiro(App.passageiros, rg);

    if (passageiroBuscado == null) {
      PassageiroView.passageiroInvalido(rg);
      return;
    }

    Aeronave aeronaveBuscada = buscarAeronave(App.aeronaves, codigoVoo);

    if (aeronaveBuscada == null) {
      AeronaveView.aeronaveInvalida(codigoVoo);
      return;
    }

    aeronaveBuscada.getPassageiros().add(passageiroBuscado);

    Passagem passagem = passageiroBuscado.getPassagem();

    PassageiroView.passageiroAddSucesso(passageiroBuscado, passagem.getId());
  }
}

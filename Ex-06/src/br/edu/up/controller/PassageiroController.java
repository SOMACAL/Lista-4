package br.edu.up.controller;

import java.util.ArrayList;
import br.edu.up.model.Listas.ListaPassageiros;
import br.edu.up.model.Modelos.Aeronave;
import br.edu.up.model.Modelos.Passageiro;

public class PassageiroController {
  public void addPassageiro(Passageiro passageiro, Aeronave aeronave) {
    ArrayList<Passageiro> passageiros = aeronave.getPassageiros();

    passageiros.add(passageiro);
  }

  public Passageiro buscarPassageiro(ListaPassageiros passageiros, String rg) {
    for (Passageiro passageiro : passageiros) {
      if (passageiro.getRg().equals(rg)) {
        return passageiro;
      }
    }
    return null;
  }
}

package br.edu.up.model.Listas;

import java.util.ArrayList;
import java.util.Iterator;

import br.edu.up.model.Modelos.Passageiro;

public class ListaPassageiros implements Iterable<Passageiro> {
  private ArrayList<Passageiro> passageiros;

  public ListaPassageiros() {
    this.passageiros = new ArrayList<Passageiro>();
  }

  public ArrayList<Passageiro> getPassageiros() {
    return passageiros;
  }

  public void adicionarPassageiro(Passageiro passageiro) {
    this.passageiros.add(passageiro);
  }

  @Override
  public Iterator<Passageiro> iterator() {
    return passageiros.iterator();
  }
}

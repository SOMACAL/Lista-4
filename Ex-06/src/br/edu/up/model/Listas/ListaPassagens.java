package br.edu.up.model.Listas;

import java.util.ArrayList;
import java.util.Iterator;

import br.edu.up.model.Modelos.Passagem;

public class ListaPassagens implements Iterable<Passagem> {
  private ArrayList<Passagem> passagens;

  public ListaPassagens() {
    this.passagens = new ArrayList<Passagem>();
  }

  public ArrayList<Passagem> getPassagens() {
    return passagens;
  }

  public void adicionarPassagem(Passagem passagem) {
    this.passagens.add(passagem);
  }

  @Override
  public Iterator<Passagem> iterator() {
    return passagens.iterator();
  }
}

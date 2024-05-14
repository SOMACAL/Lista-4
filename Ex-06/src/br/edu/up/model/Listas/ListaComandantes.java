package br.edu.up.model.Listas;

import java.util.ArrayList;
import java.util.Iterator;

import br.edu.up.model.Modelos.Comandante;

public class ListaComandantes implements Iterable<Comandante> {
  private ArrayList<Comandante> comandantes;

  public ListaComandantes() {
    this.comandantes = new ArrayList<Comandante>();
  }

  public ArrayList<Comandante> getComandantes() {
    return comandantes;
  }

  public void adicionarComandante(Comandante comandante) {
    this.comandantes.add(comandante);
  }

  @Override
  public Iterator<Comandante> iterator() {
    return comandantes.iterator();
  }
}
package br.edu.up.model.lista;

import java.util.ArrayList;
import java.util.Iterator;
import br.edu.up.model.modelo.Segurado;


public class ListaSegurado implements Iterable<Segurado> {
  private ArrayList<Segurado> segurados;

  public ListaSegurado() {
    this.segurados = new ArrayList<Segurado>();
  }

  public void setListaSegurado(ArrayList<Segurado> segurados) {
    this.segurados = segurados;
  }

  public ArrayList<Segurado> getListaSegurado() {
    return segurados;
  }

  public void add(Segurado segurado) {
    segurados.add(segurado);
  }

  @Override
  public Iterator<Segurado> iterator() {
    return segurados.iterator();
  }
}

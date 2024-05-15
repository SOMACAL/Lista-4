package br.edu.up.model.lista;

import java.util.ArrayList;
import java.util.Iterator;
import br.edu.up.model.modelo.Seguro;


public class ListaSeguro implements Iterable<Seguro> {
  private ArrayList<Seguro> seguros;

  public ListaSeguro() {
    this.seguros = new ArrayList<Seguro>();
  }

  public void setListaSeguro(ArrayList<Seguro> seguros) {
    this.seguros = seguros;
  }

  public ArrayList<Seguro> getListaSeguro() {
    return seguros;
  }

  @Override
  public Iterator<Seguro> iterator() {
    return seguros.iterator();
  }
}

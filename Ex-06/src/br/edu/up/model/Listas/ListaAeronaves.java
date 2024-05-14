package br.edu.up.model.Listas;

import java.util.ArrayList;
import java.util.Iterator;
import br.edu.up.model.Modelos.Aeronave;

public class ListaAeronaves implements Iterable<Aeronave> {
  private ArrayList<Aeronave> aeronaves;

  public ListaAeronaves() {
    this.aeronaves = new ArrayList<Aeronave>();
  }

  public ArrayList<Aeronave> getAeronaves() {
    return aeronaves;
  }

  public void adicionarAeronave(Aeronave aeronave) {
    this.aeronaves.add(aeronave);
  }

  @Override
  public Iterator<Aeronave> iterator() {
    return aeronaves.iterator();
  }
}
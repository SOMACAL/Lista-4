package br.edu.up.model.listas;

import java.util.ArrayList;
import java.util.Iterator;
import br.edu.up.model.modelos.Comercial;


public class ComercialLista implements Iterable<Comercial> {
  private ArrayList<Comercial> contatosComerciais;

  public ComercialLista() {
    this.contatosComerciais = new ArrayList<Comercial>();
  }

  public void setContatosComerciais(ArrayList<Comercial> contatosComerciais) {
    this.contatosComerciais = contatosComerciais;
  }

  public ArrayList<Comercial> getContatosComerciais() {
    return contatosComerciais;
  }

  @Override
  public Iterator<Comercial> iterator() {
    return contatosComerciais.iterator();
  }
}

package br.edu.up.model.Modelos;
import java.util.ArrayList;

public class Comandante extends Pessoa {
  private double totalHoraVoo;
  private ArrayList<String> idiomas = new ArrayList<>();

  public Comandante() {

  }

  public Comandante(String nome, String rg,  double totalHoraVoo) {
    super(nome, rg);
    this.totalHoraVoo = totalHoraVoo;
  }

  public double getTotalHoraVoo() {
    return totalHoraVoo;
  }

  public void setTotalHoraVoo(double totalHoraVoo) {
    this.totalHoraVoo = totalHoraVoo;
  }

  public ArrayList<String> getIdiomas() {
    return idiomas;
  }

  public void setIdiomas(ArrayList<String> idiomas) {
    this.idiomas = idiomas;
  }
}

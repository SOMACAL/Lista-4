package br.edu.up.model;


public class Livro {
  private String Codigo;
  private String Titulo;
  private String Autores;
  private String ISBN;
  private int Ano;

  public String getCodigo() {
    return this.Codigo;
}

public String getTitulo() {
    return this.Titulo;
}

public String getAutores() {
    return this.Autores;
}

public String getISBN() {
    return this.ISBN;
}
public int getAno() {
  return this.Ano;
}
/////////
// Setter (atribuir)
public void setCodigo(String Codigo) {
    this.Codigo = Codigo;
}

public void setTitulo(String Titulo) {
    this.Titulo = Titulo;
}
public void setAutores(String Autores) {
  this.Autores = Autores;
}

public void setISBN(String ISBN) {
  this.ISBN = ISBN;
}
public void setAno(int Ano) {
  this.Ano = Ano;
}
}

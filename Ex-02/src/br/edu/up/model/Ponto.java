package br.edu.up.model;

public class Ponto {
  private double x;
  private double y;

  public Ponto() {
    this.x = 0;
    this.y = 0;
  }

  public Ponto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double calcularDistancia(double x1, double y1, double x2, double y2) {
    double xAoQuadrado = Math.pow((x1 - x2), 2);
    double yAoQuadrado = Math.pow((y1 - y2), 2);
    double somaXY = xAoQuadrado + yAoQuadrado;
    return Math.sqrt(somaXY);
  }
}

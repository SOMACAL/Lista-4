package br.edu.up;
import br.edu.up.model.Ponto;

public class App {
	public static void main(String[] args) throws Exception {
		//1
		Ponto ponto1 = new Ponto();
		
		//2
		Ponto ponto2 = new Ponto(2, 5);
		
		//3
		System.out.println("\n-------------------------");
		double distancia1ao2 = ponto1.calcularDistancia(ponto1.getX(), ponto1.getY(), ponto2.getX(), ponto2.getY());
		System.out.println("O valor da disância entre o ponto 1 ao ponto 2 é de: " + distancia1ao2);

		//4
		System.out.println("\n-------------------------");
		Ponto ponto3 = new Ponto(7, 2);
		double distancia2ao3 = ponto2.calcularDistancia(ponto2.getX(), ponto2.getY(), ponto3.getX(), ponto3.getY());
		System.out.println("O valor da disância entre o ponto 2 ao ponto 3 é de: " + distancia2ao3);

		//5
		ponto1.setX(10);

		//6
		ponto1.setY(3);
		System.out.println("\n-------------------------");
		System.out.println("As novas coordenadas do ponto 1 é de: x:" + ponto1.getX() + " y: " + ponto1.getY());
	}
}

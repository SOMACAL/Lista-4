package br.edu.up;
import br.edu.up.model.Livro;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);

        System.out.println("\n");
        System.out.println("Livro 01:");
        System.out.println("Código: " + livro1.getCodigo());
        System.out.println("Título: " + livro1.getTitulo());
        System.out.print("Autores: ");
        for (String autor : livro1.getAutores()) {
            System.out.print(autor + ", ");
        }
        System.out.println("\nISBN: " + livro1.getISBN());
        System.out.println("Ano: " + livro1.getAno());

        System.out.println("\nLivro 02:");
        System.out.println("Código: " + livro2.getCodigo());
        System.out.println("Título: " + livro2.getTitulo());
        System.out.print("Autores: ");
        for (String autor : livro2.getAutores()) {
            System.out.print(autor + ", ");
        }
        System.out.println("\nISBN: " + livro2.getISBN());
        System.out.println("Ano: " + livro2.getAno());
    }
}

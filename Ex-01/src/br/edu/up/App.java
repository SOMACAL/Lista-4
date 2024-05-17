package br.edu.up;
import br.edu.up.model.Livro;
import br.edu.up.view.LivroView;

public class App {
    public static void main(String[] args) {
        Livro livroCore = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, "0130819336", 2005);
        Livro livroJava = new Livro("9865PLO", "Java, Como programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);

        LivroView.visualizar(livroCore, livroCore.getAutores());
        
        LivroView.visualizar(livroJava, livroJava.getAutores());
    }
}

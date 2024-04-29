package br.edu.up;

import br.edu.up.model.Livro;

public class App {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro();
        livro1.setCodigo("1598FHK");
        livro1.setTitulo("Core Java 2");
        livro1.setAutores("Cay S. Horstmann e Gary Cornell");
        livro1.setISBN("0130819336");
        livro1.setAno(2005);

            System.out.println("Codigo: " + livro1.getCodigo());
            System.out.println("Titulo: " + livro1.getTitulo());
            System.out.println("Autores: " + livro1.getAutores());
            System.out.println("ISBN: " + livro1.getISBN());
            System.out.println("Ano: " + livro1.getAno());


        Livro livro2 = new Livro();
        livro2.setCodigo("9865PLO");
        livro2.setTitulo("Java, Como programar");
        livro2.setAutores("Harvey Deitel");
        livro2.setISBN("0130341517");
        livro2.setAno(2015);

            System.out.println("\n");

            System.out.println("Codigo: " + livro2.getCodigo());
            System.out.println("Titulo: " + livro2.getTitulo());
            System.out.println("Autores: " + livro2.getAutores());
            System.out.println("ISBN: " + livro2.getISBN());
            System.out.println("Ano: " + livro2.getAno());



    }
}
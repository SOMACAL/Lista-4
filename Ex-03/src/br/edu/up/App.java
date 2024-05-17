package br.edu.up;

import br.edu.up.model.Compromisso;
import br.edu.up.view.CompromissoView;

public class App {
    public static void main(String[] args) {
        Compromisso compromisso = CompromissoView.incluir();
        CompromissoView.visualizar(compromisso);
    }
}

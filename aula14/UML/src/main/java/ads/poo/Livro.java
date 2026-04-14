package ads.poo;

import java.util.ArrayList;

public class Livro {

    private String titulo;
    private Pessoa autor;
    private ArrayList<Capitulo> capitulos;

    public Livro(String t, Pessoa p){
      this.titulo = t;
      this.autor = p;
      this.capitulos = new ArrayList<>();
    }

    public void adicionaCapitulo(String t){
        var cap = new Capitulo(t);
        capitulos.add(cap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.capitulos.forEach(sb::append);
        return "Livro: "+this.titulo+" Autor: "+ this.autor+ "Capitulos: "+sb;
    }
}

package org.example;

import java.util.ArrayList;

public class Biblioteca {
    // está emprestado ou não
    ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        livros.add(new Livro("1984")); // está pronto para emprestimo
        livros.add(new Livro("Neuromancer")); // esta pronto para emprestimo
        livros.add(new Livro("Crime e castigo", false));//nao pode ser emprestado
    }

    public void emprestimo(){

        }

        public void devolucao(){

        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        livros.forEach(l -> sb.append(l.toString()));
        return sb.toString();
    }
}

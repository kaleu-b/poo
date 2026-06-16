package org.example;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.livrosEmprestados = new ArrayList<>();
        this.nome = nome;
    }

    protected void addEmprestimo(Livro livro){
        livrosEmprestados.add(livro);
    }

}

package org.example;

public class Livro {

    private String nome;
    private boolean emprestado;

    public Livro(String nome) {
        this.emprestado = false; // por padrão não começa emprestado
        this.nome = nome;
    }

    public Livro(String nome, boolean emprestar){
        this.emprestado = emprestar;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome  + " Situação: " + ((emprestado) ? "Disponível":"Indisponível" + "\n");
    }
}

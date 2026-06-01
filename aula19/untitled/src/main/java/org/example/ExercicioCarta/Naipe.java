package org.example.ExercicioCarta;

public enum Naipe {

    PAUS(0, "Paus"),
    OURO(1, "Ouro"),
    COPAS(2, "Copas"),
    ESPADAS(3, "Espadas");

    private final int valor;
    private final String nome;

    Naipe(int valor, String nome){
        this.valor = valor;
        this.nome = nome;
    }

}

package org.example.ExercicioPlaneta;

public enum Planeta {
    MERCURIO(1, "Mercurio"),
    VENUS(2, "Vênus"),
    TERRA(3, "Terra"),
    MARTE(4, "Marte"),
    JUPITER(5, "Júpiter");

    private int codigo;
    private String nome;

    Planeta(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }


}

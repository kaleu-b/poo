package org.example.Classe;

import java.util.Arrays;

public class Disciplina {

    // bd: int
    // gui: segunda-feira

    private String nome;
    private String sigla;

    private DiaSemana[] aulas;

    public Disciplina(String sigla, String nome, DiaSemana[] aulas) {
        this.sigla = sigla;
        this.nome = nome;
        this.aulas = aulas;
    }

    @Override
    public String toString() {
        return "Disciplina: " + this.sigla + "\n"
                + "Aulas: " + Arrays.toString(aulas);
    }
}

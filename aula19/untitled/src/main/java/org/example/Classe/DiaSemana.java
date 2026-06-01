package org.example.Classe;

public enum DiaSemana {

    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda"),
    TERCA(3, "Terça"),
    QUARTA(4, "Quarta"),
    QUINTA(5, "Quinta"),
    SEXTA(6, "Sexta"),
    SABADO(7, "Sábado");

    private final int codigo;
    private final String extenso;

    DiaSemana(int codigo, String extenso) {
        this.codigo = codigo;
        this.extenso = extenso;
    }

    public static DiaSemana getBYyCodigo(int codigo){
        for (DiaSemana dia : DiaSemana.values()){
            if (dia.codigo == codigo){
                return dia;
            }
        }
        throw new IllegalArgumentException("Codigo invalido. Tente novamente :((");
    }

    @Override
    public String toString() {
        return extenso;
    }
}

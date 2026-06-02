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

    public static Naipe getByCodigo(int codigo){
        for (Naipe n : Naipe.values()){
            if (n.valor == codigo){
            return n;
            }
        }
        throw new IllegalArgumentException("Codigo invalido. Tente novamente :((");
    }

    @Override
    public String toString() {
        return "de" + this.nome;
    }
}

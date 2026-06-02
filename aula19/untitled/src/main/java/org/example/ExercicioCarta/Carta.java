package org.example.ExercicioCarta;

public class Carta {

    Naipe naipe;
    Valor valor;

    private int valorJogo;

    public Carta(Naipe naipe, Valor valor, int valorJogo) {
        this.naipe = naipe;
        this.valor = valor;
        this.valorJogo = valorJogo;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public int getValorJogo() {
        return valorJogo;
    }

    public void setValorJogo(int valorJogo) {
        this.valorJogo = valorJogo;
    }

    @Override
    public String toString() {
       return naipe.toString() + valor.toString() + valorJogo;
    }
}

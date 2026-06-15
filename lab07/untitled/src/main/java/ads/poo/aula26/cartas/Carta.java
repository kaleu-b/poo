package ads.poo.aula26.cartas;

public class Carta {
    private final Naipe naipe;
    private final Valor valor;

    public Carta(Naipe naipe, Valor valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valor getValor() {
        return valor;
    }

    public char getInicial() {
        return this.naipe.getInicial();
    }

    @Override
    public String toString() {
        return naipe.toString() + valor.toString();
    }
}
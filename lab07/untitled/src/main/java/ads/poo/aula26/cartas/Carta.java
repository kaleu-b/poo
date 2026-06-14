package ads.poo.aula26.cartas;

public class Carta {

    private Naipe naipe;
    private Valor valor;

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

    public char getInicial(){
        return this.naipe.getInicial();
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return naipe.toString() + valor.toString();
    }

}
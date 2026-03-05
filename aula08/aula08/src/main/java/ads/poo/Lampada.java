package ads.poo;

public class Lampada {
    //atributos
    private boolean ligado;
    //métodos

    boolean estaLigado(){
        return ligado;
    }

    boolean interruptor(){
        ligado = !estaLigado();
        return ligado;
    }

}

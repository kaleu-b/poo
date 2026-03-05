package ads.poo;

public class Main {
    static void main() {
    Lampada a = new Lampada();
    a.interruptor();

    Lampada b = new Lampada();

    IO.println(a.estaLigado());
    IO.println(b.estaLigado());

    }


}
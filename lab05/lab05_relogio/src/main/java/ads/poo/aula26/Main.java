// App.java  (substitui o Main.java gerado pelo template)
package ads.poo.aula26;

import ads.poo.aula26.Relogio.RelogioDigital;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {
        Draw desenho = new Draw();
        desenho.setCanvasSize(800, 800);
        desenho.setXscale(0, 1000);
        desenho.setYscale(0, 1000);
        desenho.enableDoubleBuffering();

        // Relógio vermelho no canto inferior-esquerdo, tamanho 1
        RelogioDigital relogio = new RelogioDigital(
                0, 0, 1, Draw.RED, 23, 59, 50
        );
        // relogio verde no canto superior-esquerdo, tamanho 2
        RelogioDigital relogio2 = new RelogioDigital(0, 850, 2, Draw.GREEN, 40, 52345, 89);

        desenho.clear(Color.BLACK);

        while (true) {
            relogio.tick(desenho);
            desenho.show();
            TimeUnit.SECONDS.sleep(1);
            relogio2.tick(desenho);
        }
    }
}
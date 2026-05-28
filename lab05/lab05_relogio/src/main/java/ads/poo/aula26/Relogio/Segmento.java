package ads.poo.aula26.Relogio;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {

    private boolean ligado;
    private Color corLigado;
    private Color corDesligado;

    public Segmento(boolean ligado, Color corLigado, Color corDesligado) {
        this.ligado = false;
        this.corLigado = corLigado;
        this.corDesligado = corDesligado;
    }

    public void flip(){
        this.ligado = !ligado;
    }

    public boolean isLigado(){
        return ligado;
    }

    public void ligar(){
        if (!isLigado()){
            flip();
        }
    }

    public void desligar(){
        if (isLigado()){
            flip();
        }
    }

    public void desenhar(Draw d, double x, double y,
                         double escala,
                         boolean horizontal)
    {
        d.setPenColor( ligado ? corLigado:corDesligado );

        if (horizontal){
            double[] px = {
                    0.1 * escala+x, 0.2 * escala+x, 1 * escala+x,
                    1.1 * escala+x, 1*escala+x, 0.2*escala+x
            };
            double [] py = {
                    0.2*escala+y, 0.3*escala+y, 0.3*escala+y,
                    0.2*escala+y, 0.1*escala+y, 0.1*escala+y
            };
        }else {
            double[] px = {0.1*escala+x, 0.2*escala+x, 0.2*escala+x,
                    0.1*escala+x, 0.0*escala+x, 0.0*escala+x};
            double[] py = {0.2*escala+y, 0.3*escala+y, 1.0*escala+y,
                    1.1*escala+y, 1.0*escala+y, 0.3*escala+y};
        }

    }

}

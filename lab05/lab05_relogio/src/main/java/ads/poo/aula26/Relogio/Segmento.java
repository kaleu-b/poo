package ads.poo.aula26.Relogio;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Segmento {

    private boolean ligado;
    private Color corLigado;
    private Color corDesligado;
    double[] px, py;

    public Segmento(Color corLigado, Color corDesligado) {
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
            px = new double[]{
                    0.1 * escala+x, 0.2 * escala+x, 1 * escala+x,
                    1.1 * escala+x, 1*escala+x, 0.2*escala+x
            };
            py = new double[]{
                    0.2*escala+y, 0.3*escala+y, 0.3*escala+y,
                    0.2*escala+y, 0.1*escala+y, 0.1*escala+y
            };
        }else {
            px = new double[]{0.1*escala+x, 0.2*escala+x, 0.2*escala+x,
                    0.1*escala+x, 0.0*escala+x, 0.0*escala+x};
            py = new double[]{0.2*escala+y, 0.3*escala+y, 1.0*escala+y,
                    1.1*escala+y, 1.0*escala+y, 0.3*escala+y};
        }
        d.filledPolygon(px, py);
    }

}

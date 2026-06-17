package ads.poo.aula26.cartas;

import ads.poo.aula26.ObjetoGrafico;
import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends ObjetoGrafico {

    Naipe naipe;
    Valor valor;

    public CartaGrafica(double x, double y) {
        super(x, y);
    }

    @Override
    public void desenhar(Draw d) {

    }

    @Override
    public boolean clicouDentro() {
        return false;
    }


}

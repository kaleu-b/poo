package ads.poo.aula26.dados;

import ads.poo.aula26.ObjetoGrafico;
import edu.princeton.cs.algs4.Draw;

public class DadoGrafico extends ObjetoGrafico {

    public DadoGrafico(double x, double y) {
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
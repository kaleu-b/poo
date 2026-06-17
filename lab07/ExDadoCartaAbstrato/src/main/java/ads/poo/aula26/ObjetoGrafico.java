package ads.poo.aula26;

import edu.princeton.cs.algs4.Draw;

public abstract class ObjetoGrafico {

    private double x, y;

    public abstract void desenhar(Draw d);
    public abstract boolean clicouDentro();

}

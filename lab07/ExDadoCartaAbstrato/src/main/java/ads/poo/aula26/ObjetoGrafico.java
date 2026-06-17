package ads.poo.aula26;

import edu.princeton.cs.algs4.Draw;

public abstract class ObjetoGrafico {

    private double x, y;

    public abstract void desenhar(Draw d);
    public abstract boolean clicouDentro();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public ObjetoGrafico(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

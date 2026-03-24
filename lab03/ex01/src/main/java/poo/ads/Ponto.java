package poo.ads;

public class Ponto {

    private int x, y;

    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String toString(){
        return String.format("(%d, %d)", this.x, this.y);
    }

    public double distancia(Ponto outroPonto){
        return Math.sqrt( Math.powExact( (this.x - outroPonto.getX() ), 2 ) + Math.powExact(this.y - outroPonto.getY(), 2));
    }

}
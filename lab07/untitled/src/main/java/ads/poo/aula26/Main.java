package ads.poo.aula26;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Random;

public class Main implements DrawListener {
    private Draw draw;

    String valores = "123456789qjk";
    String naipes = "oecp";
    Random r = new Random();


    public Main(){
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1200, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 600);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);
    }

    @Override
    public void mouseClicked(double x, double y) {
        //DrawListener.super.mouseClicked(x, y);
        String carta = String.format("cartas/%c%c.png",
                valores.charAt(r.nextInt(13)),
                naipes.charAt(r.nextInt(4))
        );
        this.draw.picture(x,y, carta);
        this.draw.show();
    }

    static void main() {

        Main main = new Main();
    }
}

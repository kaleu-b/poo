package ads.poo.aula26;

import ads.poo.aula26.cartas.CartaGrafica;
import ads.poo.aula26.cartas.Naipe;import ads.poo.aula26.cartas.Valor;import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.ArrayList;import java.util.Random;

public class Main implements DrawListener {
    private Draw draw;
    ArrayList<CartaGrafica> baralho = new ArrayList<>();

    /*  String valores = "123456789qjk";
    String naipes = "oecp";
    Random r = new Random();
    */
    public Main(){

        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(600, 600);
        this.draw.setXscale(0, 1200);
        this.draw.setYscale(0, 800);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

        // adicionar todas as cartas ao baralho
        for (Naipe naipe : Naipe.values()){
            for (Valor valor : Valor.values()) {
                baralho.add(new CartaGrafica(naipe, valor, 300, 300));
            }
        }



    }

    @Override
    public void mouseClicked(double x, double y) {
        DrawListener.super.mouseClicked(x,y);
        IO.println("Clique em:" + x + "," + y);
        baralho.forEach(c ->{
            if (c.clicou(x,y)){
                c.virar();
                c.desenhar(draw);
                this.draw.show();
            }
        });
    }

    static void main() {
        Main main = new Main();
    }
}

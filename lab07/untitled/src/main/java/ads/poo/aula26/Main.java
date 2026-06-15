package ads.poo.aula26;

import ads.poo.aula26.cartas.CartaGrafica;
import ads.poo.aula26.cartas.Naipe;
import ads.poo.aula26.cartas.Valor;
import ads.poo.aula26.dados.DadoGrafico;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import java.util.ArrayList;

public class Main implements DrawListener {
    private Draw draw;
    ArrayList<ObjDesenho> baralho = new ArrayList<>();

    public Main() {
        this.draw = new Draw();
        this.draw.setTitle("Jogo de cartas");
        this.draw.setCanvasSize(1080, 1500);
        this.draw.setXscale(0, 1500);
        this.draw.setYscale(0, 1500);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

        /* adicionar todas as cartas ao baralho
        for (Naipe naipe : Naipe.values()) {
            for (Valor valor : Valor.values()) {
                baralho.add(new CartaGrafica(naipe, valor, 1000, 1000));
            }
        }*/
        baralho.add(new CartaGrafica(Naipe.COPAS, Valor.ACE, 1000, 1000));
        baralho.add(new DadoGrafico(800, 1200));
        baralho.forEach(c -> c.desenhar(draw));
        draw.show();
    }

    @Override
    public void mouseClicked(double x, double y) {
        DrawListener.super.mouseClicked(x, y);
        IO.println("Clique em:" + x + "," + y);
        baralho.forEach(c -> {
           try {
            if (c instanceof DadoGrafico dado){
                if (dado.clicou(x,y)){
                    dado.girar();
                    dado.desenhar(draw);
                }
            }else if (c instanceof CartaGrafica carta){
                if (c.clicou(x,y)){
                    carta.virar();
                    carta.desenhar(draw);
                }
            }
           }catch (Exception e){
            System.err.println("Classe não válida. Tente novamente.");
           }
           finally {
               draw.show();
           }
        });
    }

    static void main() {
        Main main = new Main();
    }
}

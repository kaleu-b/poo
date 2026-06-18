package ads.poo.aula26;

import ads.poo.aula26.cartas.CartaGrafica;
import ads.poo.aula26.cartas.Naipe;
import ads.poo.aula26.cartas.Valor;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;
import java.util.ArrayList;

public class Main implements DrawListener {
    private final Draw draw;
    ArrayList<ObjetoGrafico> baralho = new ArrayList<>();

    public Main() {
        this.draw = new Draw();
        this.draw.setTitle("Teste CartaGrafica");
        this.draw.setCanvasSize(1000, 1000);
        this.draw.setXscale(0, 1500);
        this.draw.setYscale(0, 1500);
        this.draw.setDefaultCloseOperation(3);
        this.draw.enableDoubleBuffering();
        this.draw.addListener(this);

        baralho.add(new CartaGrafica(750, 750, Naipe.COPAS, Valor.ACE));
        baralho.forEach(c -> c.desenhar(draw));
        draw.show();
    }

    @Override
    public void mouseClicked(double x, double y) {
        DrawListener.super.mouseClicked(x, y);
        System.out.println("Clique em: " + x + ", " + y);

        baralho.forEach(c -> {
            try {
                if (c instanceof CartaGrafica carta) {
                    if (carta.clicouDentro(x, y)) {
                        System.out.println("Clicou na carta!");
                        carta.virar();
                        carta.desenhar(draw);
                    } else {
                        System.out.println("Clique fora da carta.");
                    }
                }
            } catch (Exception e) {
                System.err.println("Erro ao processar clique: " + e.getMessage());
            } finally {
                draw.show();
            }
        });
    }

    static void main(String[] args) {
        Main teste = new Main();
    }
}

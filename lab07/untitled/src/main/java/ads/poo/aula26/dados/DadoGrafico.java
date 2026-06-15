package ads.poo.aula26.dados;

import ads.poo.aula26.ObjDesenho;
import edu.princeton.cs.algs4.Draw;
import java.util.ArrayList;

public class DadoGrafico extends Dado implements ObjDesenho {
    private double x, y;
    private String diretorio = "dados/";

    public DadoGrafico(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void desenhar(Draw d) {
        String imagem;
        try {
            imagem = String.format("%s%s.png", diretorio, this.face);
            IO.println("Imprimindo a imagem: " + imagem);
            d.picture(this.x, this.y, imagem);
        } catch (Exception e) {
            // desenhar um emoji de dado
        }
    }

    @Override
    public boolean clicou(double x, double y) {
     int largura = 50;
     int altura = 50;

        return x >= this.x - largura / 2 && x <= this.x + largura / 2 && y >= this.y - altura / 2
                && y <= this.y + altura / 2;
    }
}
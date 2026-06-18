package ads.poo.aula26.cartas;

import ads.poo.aula26.ObjetoGrafico;
import ads.poo.aula26.exceptions.ImagemNaoEncontrada;
import ads.poo.aula26.exceptions.ObjetoDesenhoNulo;
import edu.princeton.cs.algs4.Draw;
import java.io.File;

public class CartaGrafica extends ObjetoGrafico {
    private boolean virado;
    private final Naipe naipe;
    private final Valor valor;

    public CartaGrafica(double x, double y, Naipe naipe, Valor valor) {
        super(x, y);
        this.naipe = naipe;
        this.valor = valor;
        this.virado = false;
        this.diretorio = "cartas/";
    }

    @Override
    public void desenhar(Draw d) {
        if (d == null) {
            throw new ObjetoDesenhoNulo("Objeto de desenho nulo.");
        }

        if (virado) {
            desenharVerso(d);
        } else {
            desenharFrente(d);
        }
    }

    private void desenharVerso(Draw d) {
        char versoCarta =
                (this.naipe.getInicial() == 'o' || this.naipe.getInicial() == 'c') ? 'v' : 'a';
        final String fundo = "fundo";
        imagem = String.format("%s%s%s.png", diretorio, fundo, versoCarta);

        try {
            d.picture(x, y, imagem);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new ImagemNaoEncontrada("Erro ao desenhar verso. Imagem:"+imagem);
        }
    }

    private void desenharFrente(Draw d) {
        imagem = String.format("%s%s%s.png", diretorio, this.valor, this.naipe.getInicial());
        try {
            d.picture(x, y, imagem);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new ImagemNaoEncontrada("Erro ao desenhar frente. Imagem:"+imagem);
        }
    }

    public void virar() {
        virado = !virado;
    }

    @Override
    public boolean clicouDentro(double x, double y) {
        double largura = 72;
        double altura = 96;

        return x >= this.x - largura / 2 && x <= this.x + largura / 2 && y >= this.y - altura / 2
                && y <= this.y + altura / 2;
    }
}
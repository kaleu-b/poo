package ads.poo.aula26.cartas;
import ads.poo.aula26.ObjDesenho;
import edu.princeton.cs.algs4.Draw;
import java.security.InvalidParameterException;
import java.util.Objects;

public class CartaGrafica extends Carta implements ObjDesenho {
    private boolean virada; // se está ou não virada
    private double x, y;
    private final String diretorio = "cartas/";
    private String imagem;

    public CartaGrafica(Naipe naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.virada = false; // por padrão não vem virada
        this.x = x;
        this.y = y;
    }

    // c & o = vermelho, e & p = preto
    public void desenhar(Draw d) {
        Objects.requireNonNull(d, "Draw não pode ser nulo");

        try {
            if (virada) {
                desenharVerso(d);
            } else {
                desenharCarta(d);
            }

        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Parâmetros inválidos. tente novamente");
        }
    }

    private void desenharVerso(Draw d) {
        char versoCarta;
        String fundo = "fundo";
        try {
            versoCarta = (this.getInicial() == 'c' || this.getInicial() == 'o') ? 'v' : 'a';
            imagem = String.format("%s%s%s.png", diretorio, fundo, versoCarta);
            IO.println("Imprimindo a imagem: " + imagem);
            d.picture(x, y, imagem);
        } catch (Exception e) {
            // desenhar emoji de carta virada (azul ou vermelha)
        }
    }

    private void desenharCarta(Draw d) {
        char inicialNaipe = this.getInicial();
        String valor = this.getValor().toString();
        try {
            imagem = String.format("%s%s%s.png", diretorio, valor, inicialNaipe);
            IO.println("Imprimindo imagem:" + imagem);
            d.picture(x, y, imagem);
        } catch (Exception e) {
            // desenhar emoji da carta
        }
    }

    public boolean clicou(double x, double y) {
        double largura = 72;
        double altura = 96;

        return x >= this.x - largura / 2 && x <= this.x + largura / 2 && y >= this.y - altura / 2
                && y <= this.y + altura / 2;
    }

    public void virar() {
        this.virada = !this.virada;
    }

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
}
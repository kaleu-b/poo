package ads.poo.aula26.cartas;
import ads.poo.aula26.ObjDesenho;
import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta implements ObjDesenho {

    private boolean virada; // se está ou não virada
    private double x,y;

    public CartaGrafica(Naipe naipe, Valor valor, double x, double y) {
        super(naipe, valor);
        this.virada = false; // por padrão não vem virada
        this.x = x;
        this.y = y;
    }

    // c & o = vermelho, e & p = preto
    public void desenhar (Draw d){
        String imagem;
        char versoCarta;
        try {
            String diretorio = "cartas/";
            if (virada){
                versoCarta = (this.getInicial() == 'c' || this.getInicial() == 'o') ? 'v':'a';
                String fundo = "fundo";
                imagem = String.format("%s%s%s.png", diretorio, fundo, versoCarta);
                IO.println("Imprimindo a imagem: " + imagem);
               d.picture(x, y, imagem);
            }else {
                imagem = String.format("%s%s%s.png", diretorio,this.getValor(), this.getInicial());
                IO.println("Imprimindo imagem:" + imagem);
                d.picture(x, y, imagem);
            }

        } catch (Exception e){
            // desenhar um emoji de carta
            // ou emoji da carta virada (se formos usar o mesmo método para desenhar a carta virada)
            IO.println("Não foi possível imprimir imagem");
        }

    }

    public boolean clicou(double x, double y){
     double largura = 72;
     double altura = 96;

     return x >= this.x - largura/2 && x <= this.x + largura/2 &&
                y >= this.y - altura/2 && y <= this.y + altura/2;
    }

    public void virar(){
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

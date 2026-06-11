package ads.poo.aula26.cartas;
import edu.princeton.cs.algs4.Draw;

public class CartaGrafica extends Carta{

    private final String diretorio = "cartas/";
    private boolean virada; // se está ou não virada

    public CartaGrafica(Naipe naipe, Valor valor) {
        super(naipe, valor);
        this.virada = false; // por padrão não vem virada
    }

    // c & o = vermelho, e & p = preto
    public void desenhar (Draw d, double x, double y){
        String imagem = String.format("%s%s%s.png", this.diretorio ,this.getValor(), this.getNaipe());
        try {
            d.picture(x, y, imagem);
        } catch (Exception e){
            // desenhar um emoji de carta
            // ou emoji da carta virada (se formos usar o mesmo método para desenhar a carta virada)
        }

    }

    public boolean clicou(double x, double y){
        // se clicou dentro da carta: true
        // else: false
         if (){

        }
        return false;
    }

}

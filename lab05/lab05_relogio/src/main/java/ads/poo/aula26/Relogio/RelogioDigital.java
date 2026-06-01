package ads.poo.aula26.Relogio;

import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class RelogioDigital extends Relogio {
    private final double x;
    private final double y;
    private final double escala;
    private final Color  corLigado;
    private final Display[] displays;

    private static final double ESCALA_BASE    = 25;
    private static final double FATOR_COR     = 0.2;
    private static final double LARG_DISPLAY  = 1.5;  // múltiplo de fator (inclui gap)
    private static final double LARG_SEPARADOR = 0.5; // múltiplo de fator (espaço dos ":")

    public RelogioDigital(double x, double y, int tamanho, Color cor,
                          int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
        this.x = x;
        this.y = y;
        this.corLigado = cor;

        int tam = (tamanho >= 1 && tamanho <= 3) ? tamanho : 2;
        this.escala = tam * ESCALA_BASE;

        Color corDesligado = new Color(
                (int)(cor.getRed()   * FATOR_COR),
                (int)(cor.getGreen() * FATOR_COR),
                (int)(cor.getBlue()  * FATOR_COR)
        );

        displays = new Display[6];
        for (int i = 0; i < 6; i++) {
            displays[i] = new Display(cor, corDesligado);
        }
        atualizarDisplays();
    }

    /** Avança o relógio 1 segundo, atualiza os displays e redesenha. */
    public void tick(Draw d) {
        incrementar();
        atualizarDisplays();
        desenhar(d);
    }

    /** Desenha o relógio no estado atual sem avançar o tempo. */
    public void desenhar(Draw d) {
        double larg = LARG_DISPLAY    * escala;
        double sep  = LARG_SEPARADOR  * escala;

        // Posição X de cada um dos 6 displays (2 horas | 2 minutos | 2 segundos)
        double[] xd = {
                x,
                x +   larg,
                x + 2*larg +   sep,   // após separador HH:MM
                x + 3*larg +   sep,
                x + 4*larg + 2*sep,   // após separador MM:SS
                x + 5*larg + 2*sep,
        };

        for (int i = 0; i < 6; i++) {
            displays[i].desenhar(d, xd[i], y, escala);
        }

        desenharSeparador(d, x + 2*larg,         sep);  // entre HH e MM
        desenharSeparador(d, x + 4*larg + sep,   sep);  // entre MM e SS
    }

    /** Dois pontos de separação (":") entre os pares de displays. */
    private void desenharSeparador(Draw d, double xSep, double largSep) {
        d.setPenColor(corLigado);
        double cx = xSep + largSep / 2.0;
        double r  = escala * 0.08;
        d.filledCircle(cx, y + 0.6 * escala, r);
        d.filledCircle(cx, y + 1.5 * escala, r);
    }

    private void atualizarDisplays() {
        displays[0].setDigito(getHora()     / 10);
        displays[1].setDigito(getHora()     % 10);
        displays[2].setDigito(getMinutos()  / 10);
        displays[3].setDigito(getMinutos()  % 10);
        displays[4].setDigito(getSegundos() / 10);
        displays[5].setDigito(getSegundos() % 10);
    }
}
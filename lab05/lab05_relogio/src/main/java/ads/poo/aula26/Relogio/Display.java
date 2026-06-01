package ads.poo.aula26.Relogio;

import java.awt.*;
import java.util.HashMap;
import edu.princeton.cs.algs4.Draw;

public class Display {

    private HashMap<Character, Segmento> segmentos;

    public Display(Color corLigado, Color corDesligado) {
        segmentos = new HashMap<>();
        for (char c : new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'}) {
            segmentos.put(c, new Segmento(corLigado, corDesligado));
        }
    }

    public void setDigito(int d) {
        // Mapa de quais segmentos ficam LIGADOS para cada dígito (0–9)
        // Segmentos: a=topo, b=direita-cima, c=direita-baixo,
        //            d=base, e=esquerda-baixo, f=esquerda-cima, g=meio
        String[] ligados = {
                "abcdef",  // 0
                "bc",      // 1
                "abdeg",   // 2
                "abcdg",   // 3
                "bcfg",    // 4
                "acdfg",   // 5
                "acdefg",  // 6
                "abc",     // 7
                "abcdefg", // 8
                "abcdfg",  // 9
        };

        if (d < 0 || d > 9) return;

        // Desliga todos primeiro
        for (Segmento s : segmentos.values()) {
            s.desligar();
        }

        // Liga só os que correspondem ao dígito
        for (char c : ligados[d].toCharArray()) {
            if (!segmentos.get(c).isLigado()){
            segmentos.get(c).ligar();
            }
        }
    }

    public boolean isSegmentoLigado(char segmento) {
        return segmentos.get(segmento).isLigado();
    }

    /**
     * Desenha o display. (x, y) é o canto inferior-esquerdo.
     * Layout com y crescendo para cima (padrão algs4):
     *
     *   a  → horizontal topo        → âncora (x,        y + 2*fator)
     *   b  → vertical direita-cima  → âncora (x + fator, y + fator)
     *   c  → vertical direita-baixo → âncora (x + fator, y)
     *   d  → horizontal base        → âncora (x,        y)
     *   e  → vertical esq-baixo     → âncora (x,        y)
     *   f  → vertical esq-cima      → âncora (x,        y + fator)
     *   g  → horizontal meio        → âncora (x,        y + fator)
     */
    public void desenhar(Draw d, double x, double y, double fator) {
        segmentos.get('a').desenhar(d, x,          y + 2*fator, fator, true);
        segmentos.get('b').desenhar(d, x + fator,  y + fator,   fator, false);
        segmentos.get('c').desenhar(d, x + fator,  y,           fator, false);
        segmentos.get('d').desenhar(d, x,          y,           fator, true);
        segmentos.get('e').desenhar(d, x,          y,           fator, false);
        segmentos.get('f').desenhar(d, x,          y + fator,   fator, false);
        segmentos.get('g').desenhar(d, x,          y + fator,   fator, true);
    }
}
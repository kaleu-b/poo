package ads.poo.aula26.Relogio;

import java.util.HashMap;

public class Display {

    private HashMap<Character, Segmento> segmentos;

    public Display() {
        segmentos = new HashMap<>();  // estava faltando isso!
        segmentos.put('a', new Segmento());
        segmentos.put('b', new Segmento());
        segmentos.put('c', new Segmento());
        segmentos.put('d', new Segmento());
        segmentos.put('e', new Segmento());
        segmentos.put('f', new Segmento());
        segmentos.put('g', new Segmento());
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
            if(s.isLigado()){
                s.flip();
            }
        }

        // Liga só os que correspondem ao dígito
        for (char c : ligados[d].toCharArray()) {
            if (!segmentos.get(c).isLigado()){
            segmentos.get(c).flip();
            }
        }
    }

    public boolean isSegmentoLigado(char segmento) {
        return segmentos.get(segmento).isLigado();
    }
}
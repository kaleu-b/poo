package org.example;

import org.example.personagens.*;

public class Main {
    static void main() {
        Aldeao a = new Aldeao(12, 12, 12);
        Arqueiro ar = new Arqueiro(50, 50, 50);
        Cavaleiro cav = new Cavaleiro(100, 100, 100);
       // Personagem p = new Personagem(10, 10, 10);

        Personagem[] vetor = {a, ar, cav};

        for (Personagem aux : vetor){
            if (aux instanceof Guerreiro g) {
                IO.println(g.atacar());
            }

            if (aux instanceof Aldeao al){
                IO.println(al.coletarMadeira());
                IO.println(al.coletarOuro());
            }

            IO.println(aux.mover());
        }
    }
}

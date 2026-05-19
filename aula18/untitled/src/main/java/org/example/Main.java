package org.example;

import org.example.ads.poo.produtos.Dimensao;
import org.example.ads.poo.produtos.SemFio;
import org.example.ads.poo.produtos.Telefone;

public class Main {
    static void main() {
        Dimensao d = new Dimensao();
        Telefone t = new Telefone(12, "12", "12", 12, d);
        SemFio sf = new SemFio(t.getCodigo(), t.getNumSerie(), t.getModelo(), t.getPeso(), t.getDimensao(), 12, 12, 12);
        IO.println(t.toString());
        IO.println(sf.toString());

        Telefone a = new SemFio(t.getCodigo(), t.getNumSerie(), t.getModelo(), t.getPeso(), t.getDimensao(), 12, 12, 12);
        sf.getFrequencia();

        SemFio outra = (SemFio) a;

        outra.getFrequencia();

        ((SemFio) a).getFrequencia();

        Telefone[] vetor = new Telefone[3];
        vetor[0] = t;
        vetor[1] = sf;
        vetor[2] = a;

        for (Telefone aux: vetor){
            if (aux instanceof SemFio novo){
              IO.println(novo.getFrequencia());
            }
        }
    }
}

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
    }
}

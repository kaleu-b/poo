package org.example.ads.poo.produtos;

public class Dimensao {
    private int altura;
    private int largura;

    public Dimensao(){
        altura = 2;
        largura = 2;
    }

    @Override
    public String toString() {
        return "Dimensão: " +
                "altura: " + altura +
                ", largura: " + largura;
    }
}

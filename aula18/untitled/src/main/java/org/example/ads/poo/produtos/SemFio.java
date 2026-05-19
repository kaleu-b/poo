package org.example.ads.poo.produtos;

public class SemFio extends Telefone{
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao d, double frequencia, int canais, double distanciaOperacao) {
        super(codigo, numSerie, modelo, peso, d);
        this.frequencia = frequencia;
        this.canais = canais;
        this.distanciaOperacao = distanciaOperacao;
    }

    public double getFrequencia() {
    return frequencia;
}public int getCanais() {
    return canais;
}public double getDistanciaOperacao() {
    return distanciaOperacao;
}@Override
    public String toString() {
        return super.toString()
                +"codigo: " + this.codigo
                + "SemFio" +
                "frequencia: " + frequencia +
                ", canais: " + canais +
                ", distanciaOperacao: " + distanciaOperacao;
    }
}

package org.example.ads.poo.produtos;

public class Telefone {

    protected int codigo;
    protected String numSerie;
    protected String modelo;
    protected double peso;
    protected Dimensao dimensao;

    public Telefone(int codigo, String numSerie, String modelo, double peso, Dimensao d ){
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = d;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Telefone: " +
                "codigo: " + codigo +
                ", numSerie: '" + numSerie + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", peso: " + peso +
                ", dimensao: " + dimensao.toString();
    }
}

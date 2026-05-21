package org.example.personagens;

public abstract class Personagem {

    private int vida;
    private int ataque;
    private double velocidade;

    protected int getVida() {
        return vida;
    }

    protected void setVida(int vida) {
        this.vida = vida;
    }

    protected int getAtaque() {
        return ataque;
    }

    protected void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    protected double getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public abstract String mover();

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }
}

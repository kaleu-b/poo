package org.example.Personagens;

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
/* métodos concretos
    public String atacar(){
        return "Estou atacando!";
    }

    public String mover(){
        return "Estou me movendo!";
    }
*/

    public abstract String mover();
   // public abstract String atacar(){}

    public Personagem(int vida, int ataque, double velocidade) {
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }
}

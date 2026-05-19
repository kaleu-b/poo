package org.example.Personagens;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    /* métodos concretos
    @Override
    public String atacar(){
        return super.atacar() + "Sou um cavaleiro com" + this.getAtaque() + " de ATK";
    }

    @Override
    public String mover(){
        return super.mover() + "Sou um cavaleiro com" + this.getVelocidade() + " de velocidade";
    }*/

    @Override
    public String mover() {
        return "Sou um cavaleiro e estou movendo";
    }

    @Override
    public String atacar() {
        return "Sou um cavaleiro e estou atacando";
    }
}

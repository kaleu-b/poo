package org.example.Personagens;

public class Arqueiro extends Personagem implements Guerreiro{
    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }
/*
    @Override
    public String atacar() {
        return super.atacar() + "Sou um arqueiro com " + this.getAtaque() + "de ATK";
    }

    @Override
    public String mover() {
        return super.mover() + "Sou um arqueiro com " + this.getVelocidade() + "de velocidade";
    }


 */

    @Override
    public String mover() {
        return "Sou um arqueiro e estou me movendo";
    }

    @Override
    public String atacar() {
        return "Sou um arqueiro e estou atacando";
    }
}


package org.example.Personagens;

public class Aldeao extends Personagem implements Guerreiro{

    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }
/*
    @Override
    public String atacar() {
        return super.atacar() + "Sou um aldeão com " + super.getAtaque() + " de ATK";
    }

    @Override
    public String mover() {
        return super.mover() + "Sou um aldeão com" + this.getVelocidade() + " de velocidade";
    }
*/

    @Override
    public String mover() {
        return "Sou um aldeão e estou me movendo";
    }

    @Override
    public String atacar() {
        return "Sou um aldeão e estou atacando";
    }
}



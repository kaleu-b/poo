package org.example.Personagens;

public class Arqueiro extends Personagem implements Guerreiro{

    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }
    // exemplo de implementação de método de uma classe abstrata
    @Override
    public String mover() {
        return "Sou um arqueiro e estou me movendo";
    }
    // exemplo de implementação de método de uma interface:
    @Override
    public String atacar() {
        return "Sou um arqueiro e estou atacando";
    }
}


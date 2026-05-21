package org.example.personagens;

public class Cavaleiro extends Personagem implements Guerreiro{

    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    // exemplo de integração de métodos de classed abstratas com herança e polimorfismo:
    @Override
    public String mover() {
        return "Sou um cavaleiro e estou movendo";
    }
    // exemplo de implementação de método de uma interface
    @Override
    public String atacar() {
        return "Sou um cavaleiro e estou atacando";
    }
}

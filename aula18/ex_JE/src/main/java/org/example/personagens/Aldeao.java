package org.example.personagens;

public class Aldeao extends Personagem implements Guerreiro,Coletador{

    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    // implementando métodos de uma classe abstrata
    @Override
    public String mover() {
        return "Sou um aldeão e estou me movendo";
    }

    @Override
    public String atacar() {
        return "Sou um aldeão e estou atacando";
    }

    // implementando métodos de uma interface
    @Override
    public String coletarMadeira() {
        return "Estou coletando madeira";
    }

    @Override
    public String coletarOuro() {
        return "estou coletando ouro";
    }
}



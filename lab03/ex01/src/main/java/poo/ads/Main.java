package poo.ads;


public class Main {
    static void main() {
        // criando objetos da classe ponto usando o construtor
        Ponto pontoUm = new Ponto(2, 3);
        Ponto pontoDois = new Ponto(2, 1);
        // mostrar as coordenadas de ambos objetos
        IO.println("coordenadas do ponto um: " + pontoUm);
        IO.println("coordenadas do ponto dois: " + pontoDois);
        // calcular a distância entre os dois pontos
        IO.println("Distância entre os dois pontos: " + pontoUm.distancia(pontoDois));
    }
}

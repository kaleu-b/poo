package ifsc.ads.poo;

public class Main {
    static void main() {
            Contador c = new Contador();
            Personagem p = new Personagem();
            IO.println("Exemplos da classe contador: ");
            IO.println("Valor atual:" + c.getValorAtual());
            IO.println("incrementando:");
            c.incrementa();
            IO.println("valor atual: " + c.getValorAtual());
            IO.println("alterando o valor do contador para 100");
            c.setValorAtual(100);
            IO.println("valor atual: " + c.getValorAtual());



    }
}


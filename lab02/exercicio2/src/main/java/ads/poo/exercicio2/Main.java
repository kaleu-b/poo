package ads.poo.exercicio2;
import java.util.ArrayList;
// Source - https://stackoverflow.com/a/409812
// Posted by Limbic System, modified by community. See post 'Timeline' for
// change history Retrieved 2026-03-01, License - CC BY-SA 4.0
import java.util.List;
import java.util.Random;

public class Main {
    static void main() {
        Random r = new Random();
        int numTentativas = 0;
        int input = -1;
        int min = 1;
        int max = 100;
        int numero = r.nextInt(max - min + 1) + min;
        List<Integer> tentativas = new ArrayList<>();
        do {
            try {
                input = Integer.parseInt(IO.readln("Digite um numero entre 1 e 100: "));
                if (input < numero) {
                    IO.println("É maior");
                } else if (input > numero) {
                    IO.println("É menor");
                }
                tentativas.add(input);
                IO.print("Tentativas: ");
                IO.println(tentativas);
                ++numTentativas;
            } catch (NumberFormatException e) {
                IO.println("Erro, digite um numero.");
            }

        } while (input != numero);
        IO.println("Parabéns!!!!!!!!!!!!! Adivinhou!");
        IO.print("Tentativas: " + numTentativas + ": " + tentativas);
        
    }
}

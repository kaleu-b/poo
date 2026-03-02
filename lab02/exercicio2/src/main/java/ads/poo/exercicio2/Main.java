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
        int input = -1;
        int numero = r.nextInt(100);
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

            } catch (NumberFormatException e) {
                IO.println("Erro, digite um numero.");
            }

        } while (input != numero);
        System.out.println("Parabéns!!!!!!!!!!!!! Adivinhou!");
    }
}

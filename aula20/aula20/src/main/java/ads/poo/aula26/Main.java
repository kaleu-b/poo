package ads.poo.aula26;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void main() {

        ArrayList teste = new ArrayList<>();
        HashMap teste2 = new HashMap<>();


        Integer i = 10;
        String exemplo = "ola mundo";

        Caixa caixa = new Caixa<>(i);
        Caixa<String> caixaString = new Caixa<>(exemplo);
        Caixa<Pessoa> caixaPessoa = new Caixa<>(new Pessoa(20, "Kaléu"));

        IO.println(caixa.getConteudo());
        IO.println(caixaString.getConteudo());



    }
}

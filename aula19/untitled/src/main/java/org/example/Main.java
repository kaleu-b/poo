package org.example;

import org.example.Classe.DiaSemana;
import org.example.Classe.Disciplina;
import org.example.ExercicioCarta.Baralho;

import java.sql.Array;

public class Main {
    static void main() {

        String disciplina;
        String sigla;
        int diaUm;
        int diaDois;

       disciplina = IO.readln("Digite o nome da disciplina: " );
        sigla = IO.readln("Digite a sigla: ");

        diaUm = Integer.parseInt(IO.readln("Digite o primeiro dia disciplina: "));
        diaDois = Integer.parseInt(IO.readln("Digite o segundo dia disciplina: "));

        DiaSemana primeiro = DiaSemana.getBYyCodigo(diaUm) ;
        DiaSemana segundo = DiaSemana.getBYyCodigo(diaDois);

        Disciplina disciplina1 = new Disciplina(sigla, disciplina, new DiaSemana[]{primeiro, segundo});
        IO.print(disciplina1.toString());

        Baralho baralho = new Baralho();
        IO.println(baralho.toString());
    }
}

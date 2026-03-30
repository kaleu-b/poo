package ads.poo.exercicio3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Robo r = new Robo();
        Robo r2 = new Robo("gerson");

        IO.println(r.getSerial());

        IO.println(r2.getSerial());

        IO.println(r2.getNome());

        IO.println(r.getQtdeRobos());
    }
}

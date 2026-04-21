package ads.poo.aula15;

public class Main {
    static void main() {

    String[] motores = {"turbina", "hélice", "turbina"};
    Aviao a = new Aviao(10,30,40, motores, motores.length);

    a.ligarDesligar();

    }

}
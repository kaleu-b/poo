package ads.poo.exercicio3;

public class Robo {

    private static int qtdeRobos;
    private final int serial;
    private String nome;

    public Robo(String nome) {
        this.nome = nome;
        this.serial = ++qtdeRobos;
    }

    public Robo() {
        this.serial = ++qtdeRobos;
        this.nome = " ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSerial() {
        return serial;
    }

    public static int getQtdeRobos() {
        return qtdeRobos;
    }

}

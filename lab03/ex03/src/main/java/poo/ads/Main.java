package poo.ads;

public class Main {
    static void main() {

        Retangulo r = new Retangulo();
        Retangulo e = new Retangulo(0,6, "utf-8");
        IO.println("tiangulo ascii: " +"\n" + r.toString());

        IO.println("triangulo utf-8: "+ "\n" + e.toString());

    }
}

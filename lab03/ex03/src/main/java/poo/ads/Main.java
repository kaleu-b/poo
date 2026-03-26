package poo.ads;

public class Main {
    static void main() {

        Retangulo r = new Retangulo();
        Retangulo e = new Retangulo(5,5, "ASCII");
        IO.println( r.toString());

        IO.println( e.toString());

    }
}

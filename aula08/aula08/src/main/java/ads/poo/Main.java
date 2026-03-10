package ads.poo;

public class Main {
    static void main() {
        Caneta bic = new Caneta();

        bic.setCor("Rosa choque");
        bic.setNivelTinta(0.01);
        String cor = bic.getCor();
        bic.abreTampa();
        IO.println( bic.desenhar(1, 1, 2, 1));
        IO.println("Tinta restante: " + bic.getNivelTinta());

        bic.fecharTampa();
        IO.println( bic.desenhar(1, 1, 2, 2));
        IO.println("Tinta restante: " + bic.getNivelTinta());
    }
}
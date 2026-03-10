package ads.poo.exercicio3;

public class Formas {
    static String formas = "";

    String formato() {
        return formas;
    }

    public static void triangulo(int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                // IO.print("*");
                // formas+="*";
                formas = formas.concat("*");
            }
            // formas+="\n";
            formas = formas.concat("\n");
        }
    }

    public static void losango(int altura) {
        IO.println("Isto será um losango mt maneirinho no futuro :)");
    }

    public static void retangulo(int altura, int largura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= largura; j++) {
                if (i == 1 || i == altura || j == 1 || j == largura) {
                    formas = formas.concat("*");
                } else {
                    formas = formas.concat(" ");
                }
            }
            formas = formas.concat("\n");
        }
    }
}

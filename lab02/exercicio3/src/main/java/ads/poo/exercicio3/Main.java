package ads.poo.exercicio3;

public class Main {
    static void main(String[] args) {
        int altura;
        int largura;

        if (args.length == 0) {
            IO.println("Argumentos vazios. Sayonara");
        } else if (args[0].equals("losango")) {
            altura = Integer.parseInt(args[1]);
            losango(altura);
        } else if (args[0].equals("triangulo")) {
            altura = Integer.parseInt(args[1]);
            triangulo(altura);
        } else if (args[0].equals("retangulo")) {
            altura = Integer.parseInt(args[1]);
            largura = Integer.parseInt(args[2]);
            retangulo(altura, largura);
        }
    }

    public static void triangulo(int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                IO.print("*");
            }
            IO.println();
        }
    }

    public static void losango(int altura) {
        IO.println("Isto será um losango mt maneirinho no futuro :)");
    }

    public static void retangulo(int altura, int largura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= largura; j++) {
                if (i == 1 || i == altura || j == 1 || j == largura) {
                    IO.print("*");
                } else {
                    IO.print(" ");
                }
            }
            IO.println();
        }
    }
}
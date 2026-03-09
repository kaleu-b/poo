package ads.poo.exercicio3;

public class Main {
    static void main(String[] args) {
        Formas f = new Formas();
        int altura;
        int largura;

        if (args.length == 0) {
            IO.println("Argumentos vazios. Sayonara");
            return;
        } else if ((args[0].equals("losango") || args[0].equals("triangulo") || args[0].equals("retangulo")) && args.length < 2) {
            IO.println("Valor para altura vazio. Favor");
            return;
        } else if (args[0].equals("retangulo") && args.length < 3) {
            IO.println("Valor para largura vazio. Favor entrar com o valor para largura.");
            return;
        }
        try {
            switch (args[0]) {
                case "losango" -> {
                    altura = Integer.parseInt(args[1]);
                    f.losango(altura);
                    IO.print( f.formato());
                }
                case "triangulo" -> {
                    altura = Integer.parseInt(args[1]);
                    f.triangulo(altura);
                    IO.print( f.formato());
                }
                case "retangulo" -> {
                    altura = Integer.parseInt(args[1]);
                    largura = Integer.parseInt(args[2]);
                    f.retangulo(altura, largura);
                    IO.print(f.formato());
                }
                default -> IO.println("Opção inválida.");
            }
        } catch (NumberFormatException e) {
            IO.println("Valores inválidos, favor digitar numeros.");
        }
    }
}

package poo.ads;

public class Retangulo {
    // variáveis
    private int altura;
    private int largura;
    private String cod;
    // constantes
    private static final int PADRAO_ALTURA = 3;
    private static final int PADRAO_LARGURA = 4;
    private static final String PADRAO_COD = "ASCII";
    private static final int MIN = 0;

    // construtor vazio
    public Retangulo() {
        altura = PADRAO_ALTURA;
        largura = PADRAO_LARGURA;
        cod = PADRAO_COD;
    }
    // construtor com parametros
    public Retangulo(int largura, int altura, String cod) {
        this();
        // se a altura e largura não forem valores inválidos
        if (!(altura <= MIN) && !(largura <= MIN)) {
            this.altura = altura;
            this.largura = largura;
        }
        // se a codificação for um valor válido
        if (cod.equalsIgnoreCase("ASCII")
                || cod.equalsIgnoreCase("UTF-8")) {
            this.cod = cod;
        }

    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCod() {
        return cod;
    }
    // verifica se os valores são maiores que 0 e retorna um booleano
    private boolean isValido(int valor) {
        return valor > 0;
    }
    // muda o valor do atributo se for um valor válido
    // e retorna uma booleana
    public boolean setAltura(int altura) {
        this.altura = (isValido(altura)) ? altura : this.altura;
        return isValido(altura);
    }
    // muda o valor do atributo se for um valor válido
    // e retorna uma booleana
    public boolean setLargura(int largura) {
        this.largura = (isValido(largura)) ? largura : this.largura;
        return isValido(largura);
    }
    // muda o valor do atributo se for um valor válido
    // e retorna uma booleana
    public boolean setCod(String cod) {
        if (!cod.equalsIgnoreCase("ASCII") || !cod.equalsIgnoreCase("UTF-8")) {
            return false;
        }
        this.cod = cod;
        return true;
    }

    public int getArea() {
        return largura * altura;
    }

    public int getPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String toString() {
        StringBuilder arte = new StringBuilder();
        String ln = "\n";

        String cantoSupEsq, cantoSupDir, cantoInfEsq, cantoInfDir;
        String horizontal, vertical;

        if (cod.equalsIgnoreCase("ASCII")) {
            cantoSupEsq = "+";
            cantoSupDir = "+";
            cantoInfEsq = "+";
            cantoInfDir = "+";
            horizontal = "-";
            vertical = "|";
        } else { // UTF-8
            cantoSupEsq = "\u250C"; // ┌
            cantoSupDir = "\u2510"; // ┐
            cantoInfEsq = "\u2514"; // └
            cantoInfDir = "\u2518"; // ┘
            horizontal = "\u2500"; // ─
            vertical = "\u2502"; // │
        }

        // linha superior
        arte.append(cantoSupEsq)
                .append(horizontal.repeat(largura - 2))
                .append(cantoSupDir)
                .append(ln);

        // linhas do meio
        for (int i = 0; i < altura - 2; i++) {
            arte.append(vertical)
                    .append(" ".repeat(largura - 2))
                    .append(vertical)
                    .append(ln);
        }

        // linha inferior
        if (altura > 1) {
            arte.append(cantoInfEsq)
                    .append(horizontal.repeat(largura - 2))
                    .append(cantoInfDir)
                    .append(ln);
        }

        return arte.toString();
    }
}
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
    private final int THRESHHOLD = 0;
    private final int PADRAO_CODS = 0;

    // construtor vazio
    public Retangulo() {
        altura = PADRAO_ALTURA;
        largura = PADRAO_LARGURA;
        cod = PADRAO_COD;
    }

    public Retangulo(int largura, int altura, String cod) {
        this();
        this.cod = cod;
        if (!(altura <= THRESHHOLD) && !(largura <= THRESHHOLD)) {
            this.altura = altura;
            this.largura = largura;
        } else if (!cod.equalsIgnoreCase("ASCII")
                || !cod.equalsIgnoreCase("UTF-8")) {
            this.cod = PADRAO_COD;
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

    private boolean isValido(int valor) {
        return valor > 0;
    }

    public boolean setAltura(int altura) {
        this.altura = (isValido(altura)) ? altura : this.altura;
        return isValido(altura);
    }

    public boolean setLargura(int largura) {
        this.largura = (isValido(largura)) ? largura : this.largura;
        return isValido(largura);
    }

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

    public String toString() {
        String arte = "";

        if (cod.equals("ASCII")) {
            String extremos = "+" + "-".repeat(largura-2) + "+\n";
            String miolo = "|" + " ".repeat(largura-2) + "|\n";
            for (int i=1; i<=altura;i++){
                if(i==1 || i==altura){
                    arte = arte.concat(extremos);
                }else {
                    arte = arte.concat(miolo);
                }

            }
        }



        return arte;
    }

}
package ads.poo.aula26.cartas;

public enum Naipe {
    PAUS(0, "Paus", 'p'),
    OURO(1, "Ouro", 'o'),
    COPAS(2, "Copas", 'c'),
    ESPADAS(3, "Espadas", 'e');

    private final int valor;
    private final String nome;
    private final char inicial;

    Naipe(int valor, String nome, char inicial) {
        this.valor = valor;
        this.nome = nome;
        this.inicial = inicial;
    }

    public static Naipe getByCodigo(int codigo) {
        for (Naipe n : Naipe.values()) {
            if (n.valor == codigo) {
                return n;
            }
        }
        throw new IllegalArgumentException("Codigo invalido. Tente novamente :((");
    }

    public char getInicial() {
        return inicial;
    }

    @Override
    public String toString() {
        return "de" + this.nome;
    }
}
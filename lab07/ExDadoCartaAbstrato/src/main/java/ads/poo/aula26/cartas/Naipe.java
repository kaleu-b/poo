package ads.poo.aula26.cartas;

public enum Naipe {

    PAUS("Paus", 'p'),
    OURO("Ouro", 'o'),
    COPAS("Copas", 'c'),
    ESPADA("Espada", 'e');

    private final String nome;
    private final char inicial;

    Naipe(String nome, char inicial) {
        this.nome = nome;
        this.inicial = inicial;
    }

    @Override
    public String toString() {
        return String.valueOf(this.inicial);
    }
}

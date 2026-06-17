package ads.poo.aula26.cartas;

public enum Valor {

    ACE("1"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    VALETE("j"),
    DAMA("k"),
    REI("q");

    private final String valor;

    Valor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
      return this.valor;
    }
}

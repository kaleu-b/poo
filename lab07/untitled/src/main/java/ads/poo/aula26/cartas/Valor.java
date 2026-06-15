package ads.poo.aula26.cartas;

public enum Valor {
    ACE(0, "1"),
    DOIS(1, "2"),
    TRES(2, "3"),
    QUATRO(3, "4"),
    CINCO(4, "5"),
    SEIS(5, "6"),
    SETE(6, "7"),
    OITO(7, "8"),
    NOVE(8, "9"),
    DEZ(9, "10"),
    VALETE(10, "j"),
    DAMA(11, "k"),
    REI(12, "q");

    private final int codigo;
    private final String nome;

    Valor(int codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public static Valor getByCodigo(int codigo) {
        for (Valor v : Valor.values()) {
            if (v.codigo == codigo) {
                return v;
            }
        }
        throw new IllegalArgumentException("Codigo invalido. Tente novamente :((");
    }

    @Override
    public String toString() {
        return this.nome;
    }
}

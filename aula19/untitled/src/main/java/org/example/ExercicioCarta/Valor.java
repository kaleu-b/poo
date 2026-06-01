package org.example.ExercicioCarta;

public enum Valor {

    ACE( 11, "Ás", 0),
    UM(1, "Um", 1),
    DOIS(2, "Dois", 2),
    TRES(3, "Três", 3),
    QUATRO(4, "Quatro", 4),
    CINCO(5, "Cinco", 5),
    SEIS(6, "Seis", 6),
    SETE(7, "Sete", 7),
    OITO(8, "Oito", 8),
    NOVE(9, "Nove", 9),
    DEZ(10, "Dez", 10),
    VALETE(10, "Valete", 11),
    DAMA(10, "Dama", 12),
    REI(10,"Rei", 13);

    private int valor;
    private final String nome;
    private final int codigo;

    Valor(int v, String nome, int codigo){
            this.valor = v;
            this.nome = nome;
            this.codigo = codigo;
    }

    public static Valor getByCodigo(int codigo){
        for (Valor v : Valor.values()){
            if (v.valor == codigo){
                return v;
            }
        }
        throw new IllegalArgumentException("Codigo invalido. Tente novamente :((");
    }

}

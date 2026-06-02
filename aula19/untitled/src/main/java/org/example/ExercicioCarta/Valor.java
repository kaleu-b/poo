package org.example.ExercicioCarta;

public enum Valor {

    ACE( 0, "Ás"),
    DOIS(1, "Dois"),
    TRES(2, "Três"),
    QUATRO(3, "Quatro"),
    CINCO(4, "Cinco"),
    SEIS(5, "Seis"),
    SETE(6, "Sete"),
    OITO(7, "Oito"),
    NOVE(8, "Nove"),
    DEZ(9, "Dez"),
    VALETE(10, "Valete"),
    DAMA(11, "Dama"),
    REI(12,"Rei");

    private final int codigo;
    private final String nome;

    Valor(int codigo, String nome){
            this.nome = nome;
            this.codigo = codigo;
    }

    public static Valor getByCodigo(int codigo){
        for (Valor v : Valor.values()){
            if (v.codigo == codigo){
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

package ads.poo.exercicio3;

public class Data {
    // variaveis
    private int ano;
    private int mes;
    private int dia;
    private int limite_fev = 28;
    // constantes
    private final static int LIMITE_MES = 12;
    private final static int LIMITE_DIA_31 = 31;
    private final static int LIMITE_DIA_30 = 30;
    private final static int MIN_ANO = 1970;

    private String limiteDia;

    public Data() {
        ano = 1970;
        mes = 1;
        dia = 1;
    }

    public Data(int ano, int mes, int dia) {
        this();

        if (mes < 1 || mes > LIMITE_MES || ano < MIN_ANO) {
            return;
        }

        if (isBissexto(ano)) {
            limite_fev = 29;
        }

        if (mes == 2 && (dia <= limite_fev && dia >0)) {
            this.mes = mes;
            this.dia = dia;
            this.ano = ano;
        }


        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= LIMITE_DIA_31 && dia > 0) {
                this.mes = mes;
                this.dia = dia;
                this.ano = ano;
            }
        } else if (dia <= LIMITE_DIA_30 && dia > 0) {
            this.mes = mes;
            this.dia = dia;
            this.ano = ano;

        }
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d",dia, mes, ano);
    }

}


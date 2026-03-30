package ads.poo.exercicio3;

public class Data {
    // variaveis
    private int ano;
    private int mes;
    private int dia;
    private int limite_fev;
    // constantes
    private final static int LIMITE_MES = 12;
    private final static int LIMITE_DIA_31 = 31;
    private final static int LIMITE_DIA_30 = 30;
    private final static int MIN_ANO = 1970;

    private String limiteDia;

    public Data(){
        ano = 1970;
        mes = 1;
        dia = 1;
    }

    public Data(int ano, int mes, int dia) {
        this();

        if (mes < 1 || mes > LIMITE_MES || ano<MIN_ANO) {
            return;
        }

        if (isBissexto(ano)){
            limite_fev = 29;
            if(mes == 2){

            }
        }

    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) ||
                (ano % 400 == 0);
    }

    @Override
    public String toString() {
        return this.ano + "/" + mes + "/" + dia;
    }
}
package poo.ads;

public class Horario {
    private short hora, minuto, segundo;

    private final static short MAX_HORA = 23;
    private final static short MAX_MINUTO = 59;
    private final static short MAX_SEGUNDO = 59;
    private final static short MIN_VALOR = 0;

    // construtor para hora, minutos e segundos
    public Horario(short hora, short minuto, short segundo) {
        this();
        if (isHora(hora) && isMinuto(minuto) && isSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    // construtor para hora e minuto
    public Horario(short hora, short minuto) {
        this();
        if (isHora(hora) && isMinuto(minuto)) {
            this.hora = hora;
            this.minuto = minuto;
        }
    }
    // construtor vazio
    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    // construtor somente para horário
    public Horario(short hora) {
        this();
        this.hora = (isHora(hora)) ? hora : MIN_VALOR;
    }
    // classes auxiliares para validação de valores
    private boolean isHora(short hora) {
        return hora >= MIN_VALOR && hora <= MAX_HORA;
    }

    private boolean isMinuto(short minuto) {
        return minuto >= MIN_VALOR && minuto <= MAX_MINUTO;
    }

    private boolean isSegundo(short segundo) {
        //return segundo >= MIN_VALOR && segundo <= MAX_SEGUNDO;
        return segundo >= MIN_VALOR && segundo <= MAX_SEGUNDO;
    }

    public boolean setHora(short hora) {
        // this.hora = hora;
        if (!isHora(hora)) {
            return false;
        } else {
            this.hora = hora;
            return true;
        }
    }

    public boolean setMinuto(short minuto) {
        // this.minuto = minuto;
        if (!isMinuto(minuto)) {
            return false;
        } else {
            this.minuto = minuto;
            return true;
        }
    }

    public boolean setSegundo(short segundo) {
        if (!isSegundo(segundo)) {
            return false;
        } else {
            this.segundo = segundo;
            return true;
        }
    }

    public long getSegundos() {
        return (this.hora * 3600) + (this.minuto * 60) + segundo;
    }

    public long diffSegundos(Horario outroHorario) {
        return Math.abs(this.getSegundos() - outroHorario.getSegundos());
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    //especificamente para horas
    private String isFeminino(int num){
        return (num == 2) ? "duas" : numeroPorExtenso(num);
    }

    private String numeroPorExtenso(int num) {
        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco",
                "seis", "sete", "oito", "nove", "dez", "onze",
                "doze", "treze", "quatorze", "quinze",
                "dezesseis", "dezessete", "dezoito", "dezenove"};

        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta"};

        if (num < 20) {
            return unidades[num];
        } else {
            int dez = num / 10;
            int uni = num % 10;

            if (uni == 0) {
                return dezenas[dez];
            } else {
                return dezenas[dez] + " e " + unidades[uni];
            }
        }
    }

    public String toExtenso() {
        String hEx = isFeminino(this.hora) + " hora" + (this.hora != 1 ? "s" : "");
        String mEx = numeroPorExtenso(this.minuto) + " minuto" + (this.minuto != 1 ? "s" : "");
        String sEx = numeroPorExtenso(this.segundo) + " segundo" + (this.segundo != 1 ? "s" : "");

        return hEx + ", " + mEx + " e " + sEx;
    }

}

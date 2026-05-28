package ads.poo.aula26.Relogio;

public class Relogio {

    private int hora;
    private int minutos;
    private int segundos;

    private static int MAX_SEGUNDO = 60;
    private static int MAX_MINUTO = MAX_SEGUNDO;
    private static int MAX_HORA = 24;

    public Relogio(int hora, int minutos, int segundos) {
        this.hora = (validaHora(hora)) ? hora:0;
        this.minutos = (validaMinuto(minutos)) ? minutos:0;
        this.segundos = (validaSegundo(segundos)) ? segundos:0;
    }

    protected void checkTempo(){
        checkSegundo();
        checkMinuto();
        checkHora();
    }

    protected void checkSegundo(){
        if(validaSegundo(this.segundos)){
            segundos = 0;
            minutos++;
        }
    }

    public void checkMinuto(){
        if(validaMinuto(this.minutos)){
            minutos = 0;
            hora++;
        }
    }

    public void checkHora(){
        if (validaHora(this.hora)){
            hora = 0;
            minutos = 0;
            segundos = 0;
        }
    }

    protected boolean validaHora(int valorHora){
        return valorHora >= MAX_HORA;
    }

    protected boolean validaMinuto(int valorMinuto){
        return valorMinuto >= MAX_MINUTO;
    }

    protected boolean validaSegundo(int valorSegundo){
        return valorSegundo >= MAX_SEGUNDO;
    }

    protected void incrementar(){
        segundos++;
        checkTempo();
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}

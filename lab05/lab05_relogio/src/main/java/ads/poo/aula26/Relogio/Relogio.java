package ads.poo.aula26.Relogio;

public class Relogio {

    private int hora;
    private int minutos;
    private int segundos;

    private static int MAX_SEGUNDO = 60;
    private static int MAX_MINUTO = MAX_SEGUNDO;
    private static int MAX_HORA = 24;

    public Relogio(int hora, int minutos, int segundos) {
        this.hora = !(transbordou(hora, MAX_HORA) || estaNegativo(hora)) ? hora:0;
        this.minutos = !(transbordou(minutos, MAX_MINUTO) || estaNegativo(minutos)) ? minutos:0;
        this.segundos = !(transbordou(segundos, MAX_SEGUNDO) || estaNegativo(segundos)) ? segundos:0;
    }

    protected void checkTempo(){
        checkSegundo();
        checkMinuto();
        checkHora();
    }

    protected void checkSegundo(){
        if(transbordou(segundos, MAX_SEGUNDO)){
            segundos = 0;
            minutos++;
        }
    }

    protected void checkMinuto(){
        if(transbordou(minutos, MAX_MINUTO)){
            minutos = 0;
            hora++;
        }
    }

    protected void checkHora(){
        if (transbordou(hora, MAX_HORA)){
            hora = 0;
            minutos = 0;
            segundos = 0;
        }
    }

   protected boolean estaNegativo(int valorTempo){
        return valorTempo < 0;
   }

    protected boolean transbordou(int valorTempo, int max){
        return valorTempo >= max;
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

package ads.poo.aula26.Relogio;

public class Segmento {

    private boolean ligado;

    public void flip(){
        this.ligado = !ligado;
    }

    public boolean isLigado(){
        return ligado;
    }

}

package ads.poo;

public class Motor {

    private int hp;
    private int giroAtual;
    private int cilindros;

    public Motor(){
        hp = 100;
        giroAtual = 0;
        cilindros = 2;
    }

    public int getGiroAtual() {
        return giroAtual;
    }

    public void setGiroAtual(int giroAtual) {
        this.giroAtual = giroAtual;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void acelar(int v){
        this.giroAtual += v;
    }
}

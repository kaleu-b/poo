package ifsc.ads.poo;

public class Contador {
   private int valorAtual;

    public int getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void incrementa(){
        this.valorAtual++;
    }
}

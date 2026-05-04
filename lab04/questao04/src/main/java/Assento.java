public class Assento {
    private final int numero;
    private boolean ocupado;

    public Assento(int n){
        this.numero = n;
        this.ocupado = false;
    }

    public void ocupar(){
        this.ocupado = true;
    }

    public boolean isOcupado(){
        return ocupado;
    }

    public int getNumero(){
        return this.numero;
    }
}
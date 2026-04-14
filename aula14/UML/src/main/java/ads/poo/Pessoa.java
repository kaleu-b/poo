package ads.poo;

public class Pessoa {

    private String nome;

    public Pessoa(String n){
     this.nome = n;
    }

    @Override
    public String toString() {
        return nome;
    }
}

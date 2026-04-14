package ads.poo;

public class Carro {

    private String marca;
    private Motor propulsor;

    public Carro(String ma, Motor mo){
        this.marca = ma;
        this.propulsor = mo;
    }

    public void acelerar(int v){
        this.propulsor.acelar(v);
    }

    public void trocarMotor(Motor m){
       this.propulsor = m;
    }

}

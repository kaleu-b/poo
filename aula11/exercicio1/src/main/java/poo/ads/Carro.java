package poo.ads;

public class Carro {
    private String modelo;
    private double velocidadeAutual;
    private double velocidadeMaxima;

    public final static double VEL_MAX_MODELOS = 300;
    private final static double VEL_MIN_MODELOS = 0;

    public Carro(String modelo, double velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = (velocidadeMaxima < VEL_MAX_MODELOS) ? velocidadeMaxima : VEL_MAX_MODELOS;
        this.velocidadeAutual = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar(double incremento){
            this.velocidadeAutual = (velocidadeAutual+incremento < velocidadeMaxima) ? velocidadeAutual+incremento : VEL_MAX_MODELOS ;
    }

    public void freiar(double decrescimo){
          this.velocidadeAutual = (velocidadeAutual-decrescimo > VEL_MIN_MODELOS) ? velocidadeAutual-decrescimo : VEL_MIN_MODELOS;
    }

    public double getVelocidadeAutual() {
        return velocidadeAutual;
    }
}
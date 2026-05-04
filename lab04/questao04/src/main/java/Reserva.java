import java.util.ArrayList;

public class Reserva {
    private String codigo;
    private ArrayList<Assento> assentos;
    private Passageiro passageiro;

    public Reserva(String c, ArrayList<Assento> ass, Passageiro p){
        this.codigo = c;
        this.assentos = ass;
        this.passageiro = p;
    }

    public ArrayList<Assento> getAssentos() {
        return assentos;
    }
}
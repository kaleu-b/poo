import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Voo {

    private int numeroVoo;
    private String destino;
    private LocalDate dataPartida;
    private LocalDateTime horaPartida;
    private HashMap<Integer, Assento> assentos;
    private ArrayList<Reserva> reservas;
    private final int maxPassageiros;

    public Voo(int nv, String destino, LocalDate dt, LocalDateTime hr, int passageiros){
        this.numeroVoo = nv;
        this.destino = destino;
        this.dataPartida = dt;
        this.horaPartida = hr;
        this.maxPassageiros = passageiros;
        this.assentos = new HashMap<>();
        this.reservas = new ArrayList<>();

        for (int i = 1; i <= passageiros; i++){
            assentos.put(i, new Assento(i));
        }
    }

    public void addReserva(Reserva r){
        // ocupa os assentos
        for (Assento a : r.getAssentos()){
            assentos.get(a.getNumero()).ocupar();
        }
        reservas.add(r);
    }
}
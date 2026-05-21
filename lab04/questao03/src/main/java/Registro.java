import java.time.LocalDate;

public class Registro {

    private Veiculo veiculo;
    private  Motorista motorista;
    private LocalDate data;
    private float distancia;

    public Registro(Veiculo veiculo, Motorista motorista, LocalDate data, float distancia) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.data = data;
        this.distancia = distancia;
    }
}

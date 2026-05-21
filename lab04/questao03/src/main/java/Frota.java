import java.time.LocalDate;
import java.util.ArrayList;

public class Frota {

    private ArrayList<Veiculo> veiculos = new ArrayList<>();
    private ArrayList<Registro> registros = new ArrayList<>();

    public Frota(ArrayList<Veiculo> veiculos, ArrayList<Registro> registros) {
        this.veiculos = veiculos;
        this.registros = registros;
    }

    public void criarRegistro(Veiculo v, Motorista m, LocalDate data, float distancia){
        Registro r = new Registro(v, m, data, distancia);
        registros.add(r);
    }

    public String mostrarVeiculos(){
        StringBuilder sb = new StringBuilder();
       veiculos.forEach(sb::append);
        return sb.toString();
    }

    public String mostrarRegistro(){
        StringBuilder sb = new StringBuilder();
        registros.forEach(sb::append);
        return sb.toString();
    }
}

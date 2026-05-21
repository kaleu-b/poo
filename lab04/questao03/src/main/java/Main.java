import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // --- Criando veículos ---
        Veiculo v1 = new Veiculo("ABC-1234", "Fiat Strada", "2020");
        Veiculo v2 = new Veiculo("DEF-5678", "VW Gol", "2018");
        Veiculo v3 = new Veiculo("GHI-9012", "Toyota Hilux", "2022");

        // --- Criando motoristas ---
        Motorista m1 = new Motorista("Carlos Silva");
        Motorista m2 = new Motorista("Ana Souza");

        // --- Criando registros (motorista + veículo + data) ---
        Registro r1 = new Registro(v1, m1, LocalDate.of(2024, 3, 10), 1200.05f);
        Registro r2 = new Registro(v2, m2, LocalDate.of(2024, 3, 12), 1499.09f);
        Registro r3 = new Registro(v3, m1, LocalDate.of(2024, 3, 15), 199999.06f); // Carlos dirigiu dois veículos
        Registro r4 = new Registro(v1, m2, LocalDate.of(2024, 3, 20), 81571495.00f); // v1 usado por motoristas diferentes

        // --- Criando a frota e adicionando veículos ---
        Frota frota = new Frota();
        frota.addVeiculo(v1);
        frota.addVeiculo(v2);
        frota.addVeiculo(v3);

        // --- Adicionando registros à frota ---
        frota.addRegistro(r1);
        frota.addRegistro(r2);
        frota.addRegistro(r3);
        frota.addRegistro(r4);

        // --- Exibindo resultados ---
        System.out.println("=== VEÍCULOS DA FROTA ===");
        frota.mostrarVeiculos();

        System.out.println("\n=== REGISTROS DE USO ===");
        frota.mostrarRegistro();
    }
}
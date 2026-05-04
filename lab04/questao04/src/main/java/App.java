import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        // cria voo
        Voo voo = new Voo(1, "Dubai", LocalDate.now(), LocalDateTime.now(), 20);

        // cria passageiro
        Passageiro p = new Passageiro("João", "joao@email.com", "99999999");

        // cria lista de assentos
        ArrayList<Assento> assentos = new ArrayList<>();
        assentos.add(new Assento(12));
        assentos.add(new Assento(14));

        // cria reserva
        Reserva r = new Reserva("ABC123", assentos, p);

        // adiciona reserva ao voo
        voo.addReserva(r);

        System.out.println("Reserva realizada com sucesso!");
    }
}
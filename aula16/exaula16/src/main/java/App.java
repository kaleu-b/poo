import java.time.LocalDate;

public class App {

    public static void main(String args[]){
        Agenda agenda = new Agenda();

        // Contatos de teste
        agenda.addContato(new Contato("João", "Silva", LocalDate.of(2011, 2, 4)));
        agenda.addContato(new Contato("Maria", "Oliveira", LocalDate.of(1998, 7, 15)));
        agenda.addContato(new Contato("Carlos", "Souza", LocalDate.of(2005, 12, 1)));
        agenda.addContato(new Contato("Ana", "Pereira", LocalDate.of(1990, 3, 22)));
        agenda.addContato(new Contato("Lucas", "Ferreira", LocalDate.of(2010, 10, 9)));

        // Adicionando telefones
        agenda.addTelefone("casa", "9999-1111", 0);
        agenda.addTelefone("pessoal", "12031111", 0);
        agenda.addTelefone("trabalho", "8888-2222", 1);
        agenda.addTelefone("celular", "9777-3333", 2);

        // Adicionando emails
        agenda.addEmail("pessoal", "joao@email.com", 0);
        agenda.addEmail("trabalho", "joao@trabalho.com", 0);
        agenda.addEmail("trabalho", "maria@empresa.com", 1);
        agenda.addEmail("outro", "carlos@gmail.com", 2);
        agenda.addEmail("testeInvalido", "carlos@blabla.com", 20);
        // Teste de busca
        System.out.println("BUSCA:");
        System.out.println(agenda.findContato("Maria", "Oliveira"));

        // Listar tudo
        System.out.println("\nAGENDA COMPLETA:");
        System.out.println(agenda);
    }
}
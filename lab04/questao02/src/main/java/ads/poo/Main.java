package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Diretor
        Diretor diretor = new Diretor("Danny Boyle", "Escócia");

        // Atores (chave = personagem interpretado)
        HashMap<String, Ator> atores = new HashMap<>();
        Ator ewanMcGregor = new Ator("Ewan McGregor", "Escocês", LocalDate.of(1971, 3, 31));
        Ator ewenBremmer = new Ator("Ewen Bremmer", "Escocês", LocalDate.of(1972, 04, 04));
        atores.put("Mark Renton", ewanMcGregor);
        atores.put("Spud", ewenBremmer );
        // Filme (listas inicializadas vazias por enquanto)
        Filme trainspotting = new Filme(
                diretor,
                atores,
                "Trainspotting",
                "Drama",
                LocalDate.of(1996, 2, 23),
                new ArrayList<>()
        );

        // Usuário
        Usuario usuario = new Usuario("João", "joao@email.com", "1234", new ArrayList<>());

        // Avaliação
        Avaliacao avaliacao = new Avaliacao(5, "Obra-prima!", usuario);

        // Adiciona avaliação ao filme
        trainspotting.getAvaliacoes().add(avaliacao);

        // Verifica
        System.out.println("Filme: " + trainspotting.getTitulo());
        System.out.println("Diretor: " + trainspotting.getDiretor().getNome());
        System.out.println("Atores:");
        trainspotting.getAtores().forEach((personagem, ator) -> {IO.println( personagem + " " + ator.getNome()); } );
        System.out.println("Avaliações: " + trainspotting.getAvaliacoes().size());
    }
}
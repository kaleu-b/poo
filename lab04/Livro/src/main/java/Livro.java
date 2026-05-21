import java.util.ArrayList;

public class Livro {

    private int idLivro;
    private String titulo;
    private String idioma;
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Edicao> edicoes;

    public Livro(){
        idLivro = 1;
        titulo = "baskdfas";
        idioma = "pt-br";
        edicoes = new ArrayList<>();
    }
}
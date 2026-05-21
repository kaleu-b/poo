package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Filme {

    private Diretor diretor;
    private HashMap<String, Ator> atores;
    private String titulo;
    private String genero;
    private LocalDate lancamento;
    private ArrayList<Avaliacao> avaliacoes;

    public Filme(Diretor diretor, HashMap<String, Ator> atores, String titulo, String genero, LocalDate lancamento, ArrayList<Avaliacao> avaliacoes) {
        this.diretor = diretor;
        this.atores = atores;
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;
        this.avaliacoes = avaliacoes;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public HashMap<String, Ator> getAtores() {
        return atores;
    }

    public void setAtores(HashMap<String, Ator> atores) {
        this.atores = atores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}

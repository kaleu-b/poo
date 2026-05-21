package ads.poo;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private ArrayList<Avaliacao> avaliacaos;

    public Usuario(String nome, String email, String senha, ArrayList<Avaliacao> avaliacaos) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.avaliacaos = avaliacaos;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public ArrayList<Avaliacao> getAvaliacaos() {
        return avaliacaos;
    }
}

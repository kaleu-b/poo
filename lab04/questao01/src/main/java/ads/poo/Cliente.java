package ads.poo;

import java.util.HashMap;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String email;
    private HashMap<String, Endereco> enderecos;

    public Cliente(String nome, String sobrenome, String email, HashMap<String, Endereco> enderecos) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.enderecos = enderecos;
    }

}

import java.time.LocalDate;

public class Contato {

    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private ColecaoTelefone telefones;
    private ColecaoEmail emails;

    public Contato(String nome, String sobrenome, LocalDate dN){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dN;
        this.telefones = new ColecaoTelefone();
        this.emails = new ColecaoEmail();
    }

    public boolean addTelefone(String rotulo, String telefone){
       return this.telefones.add(rotulo, telefone);
    }

    public boolean updateTelefone(String rotulo, String telefone){
        return this.telefones.update(rotulo, telefone);
    }

    public boolean removeTelefone(String rotulo){
        return this.telefones.remove(rotulo);
    }

    public boolean addEmail(String rotulo, String email){
        return this.emails.add(rotulo, email);
    }

    public boolean updateEmail(String rotulo, String telefone){
        return this.emails.update(rotulo, telefone);
    }

    public boolean removeEmail(String rotulo){
        return this.emails.remove(rotulo);
    }

}

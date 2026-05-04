package ads.poo;

public class Endereco {
    String endereco;
    String complemento;

    public Endereco(String endereco, String complemento){
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}

package ads.poo;

public class Produto {

    private String descricao;
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String descricao, String nome, float preco, int q){
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = q;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
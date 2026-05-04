package ads.poo;

public class ItemPedido {

    private int quantidade;
    private Produto produto;

    public ItemPedido(int q, Produto p){this.produto = p; this.quantidade = q;}

    public float valorTotal(){
        return this.produto.getPreco() * this.quantidade;
    }
    
}

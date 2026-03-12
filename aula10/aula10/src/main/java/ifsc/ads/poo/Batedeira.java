package ifsc.ads.poo;
// contexto: você é uma loja que quer vender as batedeiras,
// quais informações são necessárias que o clinte saiba?
public class Batedeira {
    private double preco;
    private String marca, cor;
    private int consumo;


    public double getPreco() {
        return preco;
    }


    public void setPreco(double preco) {
        this.preco = preco;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public int getConsumo() {
        return consumo;
    }


    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
}

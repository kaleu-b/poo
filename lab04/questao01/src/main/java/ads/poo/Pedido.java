package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

    private LocalDate data;
    private String situacao;
    private ArrayList<ItemPedido> itens;

    public Pedido(LocalDate dt, String sit, ArrayList<ItemPedido> itens){
        this.data = dt;
        this.situacao = sit;
        this.itens = itens;
    }

    public float calcularTotal(){
       return (float) itens.stream()
               .mapToDouble(ItemPedido::valorTotal)
               .sum();
    }

}
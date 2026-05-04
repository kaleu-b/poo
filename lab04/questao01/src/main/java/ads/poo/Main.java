package ads.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static void main() {
       var endereco = new Endereco("rua n sei das quantas", "casa");
       var endereco2 = new Endereco("rua tal n° 67", "Apartamento");
       var enderecos = new HashMap<String, Endereco>();
       enderecos.put(endereco.complemento, endereco);
       enderecos.put(endereco2.complemento, endereco2);
       var cliente = new Cliente("joao", "silva", "joaosilva@gmail.com", enderecos);

       var produto = new Produto("refrigerante", "pepsi", 12.99f, 12);
        var produto2 = new Produto("tomate", "tomate", 1.00f, 2);

        var pedido = new ItemPedido(10, produto);
        var pedido2 = new ItemPedido(2, produto2);

        var pedidos = new ArrayList<ItemPedido>();
        pedidos.add(pedido);
        pedidos.add(pedido2);

        var ped = new Pedido(LocalDate.now(), "Pendente", pedidos);

        IO.println(ped.calcularTotal());
    }
}

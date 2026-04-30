# Modelo UML da questão 1

```mermaid
    classDiagram
    direction LR

    class Produto{
     - nome:String   
     - descricao:String
     - preco:float
     - quantidade: int
     + Produto(descricao:String, preco:float, quantidade:int)
    }
 
    class Cliente{
    -nome:String
    -email:String
    -enderecos:HashMap<String, String>
    }
 
    class Pedido{
    - dataPedido:LocalDate
    - situacao:String
    - produtos:ArrayList~Produto~
    + Pedido(dt:LocalDate, situacao:String, p:ArrayList<Produto>)
    }
    
    Pedido "1..*" *-- "1" Cliente
    Pedido "1" o-- "1..*" Produto
```
#### placeholder class app (pode ou não ser adicionada depois)
``` 
class App{
- produtos:HashMap<String, Produto>    
+ addProduto(p:Produto, nome:String)
+ rmProduto(chave:String)
+ addEstoque(qtde:int, chave:String)
+ rmEstoque(qtde:int, chave:String)
}
```    
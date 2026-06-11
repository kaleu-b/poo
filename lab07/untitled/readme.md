```mermaid
classDiagram
direction TB

    class Naipe {
        <<enumeration>>
    }

    class Valor {
        <<enumeration>>
    }

    class Carta {
    }

    class CartaGrafica {
        -x,y:double
        +desenhar(Draw d)
        +clicouDentro()boolean
    }

    class Main {
        -elementos: ArrayList~Desenho~
    }

    class Dado {
        -face:int
        -est:int[]
        +jogar()
    }

    class DadoGrafico {
        -x: double
        -y: double
        -virado:boolean
        +desenhar(d: Draw)
        +clicouDentro(x: double, y: double) : boolean
    }

    class Desenho {
        <<interface>>
        +desenhar()
        +clicouDentro(x: double, y: double) : boolean
    }

    Naipe --o Carta
    Valor --o Carta
    CartaGrafica --|> Carta
    DadoGrafico --|> Dado
    Desenho <|.. CartaGrafica
    Desenho <|.. DadoGrafico
    Main *-- Desenho
    
    
```
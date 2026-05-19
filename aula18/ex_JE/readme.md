```` mermaid
    classDiagram
    direction TB
    
    class Personagem{
        -vida:int
        -ataque:int
        -velocidade:double
        +mover()String*
        +atacar()String*
        +Personagem(vida:int, ataque:int, velocidade:double)
    }
    
    class Aldeao{
        
    }
    
    class Arqueiro{
    
    }
    
    class Cavaleiro{
    
    }
    
    Aldeao --|> Personagem
    Cavaleiro --|> Personagem
    Arqueiro --|> Personagem
````
```mermaid
    classDiagram
        direction TB
        
        class Naipe{
            
        }
        
        class Valor{
            
        }
        
        class Carta{
            
        }
        
        class CartaGrafica{
            
        }   
        
        class Main{
            
        }
        
         Naipe --* Carta
         Valor --* Carta
         CartaGrafica --|> Carta
         Main -- CartaGrafica
```
```mermaid
    classDiagram
    direction LR 
    
    class Filme {
        
    }
    
    class Ator{
        
    }
    
    class Avaliacao{
        
    }
    
    class Usuario{
        
    }
    
    Filme "1..*" o-- "1..*" Ator
    Filme "1" *-- "0..*" Avaliacao
    Usuario "1" *-- "1..*" Avaliacao
```
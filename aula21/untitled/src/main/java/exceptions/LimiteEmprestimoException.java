package exceptions;

public class LimiteEmprestimoException extends BibliotecaException {
    public LimiteEmprestimoException(String message) {
        super(message + "Você já está no limite do empréstimo. Devolva pelo menos um livro antes de tirar outro empréstimo.");
    }
}

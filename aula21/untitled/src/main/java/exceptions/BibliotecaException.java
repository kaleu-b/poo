package exceptions;

public class BibliotecaException extends RuntimeException {
    public BibliotecaException(String message) {
        super("Um erro ocorreu: ");
    }
}

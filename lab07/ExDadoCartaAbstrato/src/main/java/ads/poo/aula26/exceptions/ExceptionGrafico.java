package ads.poo.aula26.exceptions;

public abstract class ExceptionGrafico extends RuntimeException {
    public ExceptionGrafico(String message) {
        super("Erro: " + message);
    }
}

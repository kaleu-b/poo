package exceptions;

public class LivroNaoEmprestado extends BibliotecaException {
    public LivroNaoEmprestado(String message) {
        super(message+"Esse livro não pode ser devolvido");
    }
}

package exceptions;

public class LivroJaEmprestado extends BibliotecaException{
    public LivroJaEmprestado(String message) {
        super(message + "Esse livro já foi emprestado. Escolha outro livro");
    }
}

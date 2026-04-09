package ads.poo;

public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private final String ISBN;

    public Livro(String ISBN, String titulo, String autor, int ano) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "titulo: '" + titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", ano: " + ano +
                ", ISBN: '" + ISBN + '\''
                ;
    }
}
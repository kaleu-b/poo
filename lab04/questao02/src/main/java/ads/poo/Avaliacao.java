package ads.poo;

public class Avaliacao {

    private Usuario avaliador;
    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario, Usuario avaliador) {
        this.nota = nota;
        this.comentario = comentario;
        this.avaliador = avaliador;
    }

    public Usuario getAvaliador() {
        return avaliador;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }
}

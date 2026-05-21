public class Edicao {

    private int idEdicao;
    private String ano;
    private int paginas;
    private String isbn;
    private Editora editora;

    public Edicao(Editora e){
        idEdicao = 1;
        ano = "1987";
        paginas = 200;
        isbn = 12;
        editora = e;
    }

}
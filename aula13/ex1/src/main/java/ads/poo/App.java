package ads.poo;

import java.util.HashMap;

public class App {

    public HashMap<String, Livro> acervo = new HashMap<>();

    public App(){
        Livro l1 = new Livro("123","neuromancer","william gibson", 1964 );
        Livro l2 = new Livro("456","game of thrones","george r.r martin", 1990 );
        Livro l3 = new Livro("789","it a coisa","stephen king", 1980 );
        Livro l4 = new Livro("101","crime e castigo","fiodor dostoyevsky", 1890 );

        acervo.put(l1.getISBN(), l1);
        acervo.put(l2.getISBN(), l2);
        acervo.put(l3.getISBN(), l3);
        acervo.put(l4.getISBN(), l4);
    }

    void menu(int opcao){
       switch (opcao){
            case 1 -> cadastrar();
            case 2 -> listar();
            case 3 -> listarAno();
           default -> IO.println("Opção não encontrada.");
        }
    }

    void cadastrar(){
        var nome = IO.readln("Digite o nome do livro: ");
        var isbn = IO.readln("Digite a ISBN do livro");
        var ano = Integer.parseInt(IO.readln("Digite o ano de publicação do livro: "));
        var autor = IO.readln("Digite o autor do livro: ");

        var livro = new Livro(isbn,nome,autor,ano);
        acervo.put(livro.getISBN(), livro);
    }

    void listar(){
        acervo.forEach((_, Livro) ->
                IO.println(Livro));
    }

    void listarAno(){
       var ano = Integer.parseInt(IO.readln("Digite o ano que busca procurar: "));
        acervo.forEach((_, Livro) -> {
            if (Livro.getAno() == ano){
                IO.println(Livro);
            }
        } );
    }

    void alterar(){
        var procura = IO.readln("digite o ISBN do livro que deseja alterar: ");
        IO.println("""
                Qual informação deseja alterar?
                1 - Título
                2 - ISBN
                3 - Ano
                4 - Autor
                """);
        var opcao = Integer.parseInt(IO.readln("Digite a opção: "));
        switch (opcao){
            case 1 -> // todo: terminar esse menu
        }
    }

    static void main() {
    App app = new App();
        /*sistema de gestão de acervo de uma biblioteca
         * 1 - cadastrar livro
         * 2 - listar todos os livros
         * 3 - listar todos os livros publicados em um certo ano
         * 4 - alterar os dados de um livro
         * 5 - sair
         * */
        // todo: criar 4 livros no construtor da classe e adicionar ao hashmap
        int opcao;
        do {
            IO.println("""
                .: ACERVO :.
                1 - Cadastrar um livro
                2 - Listar todos os livros do acervo
                3 - Listar todos os livros do acervo de um certo ano
                4 - Alterar os dados de um livro
                5 - Sair
                """);
            opcao = Integer.parseInt(IO.readln("Digite a opção: "));
            app.menu(opcao);
        }while(opcao != 5);

    }

}

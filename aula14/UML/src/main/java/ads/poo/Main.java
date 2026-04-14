package ads.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Livro l1 = new Livro("neuromancer", new Pessoa("William Gibson"));

        l1.adicionaCapitulo("cap 1");
        l1.adicionaCapitulo("cap 2");
        IO.print( l1.toString());
    }
}

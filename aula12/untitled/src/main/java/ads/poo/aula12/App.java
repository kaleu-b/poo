package ads.poo.aula12;

import java.util.ArrayList;

public class App {
ArrayList<Conta_Bancaria> contas;
    public App() {
        contas = new ArrayList<>();
    }

    void menu(int opcao) {

        switch (opcao) {
            case 1 -> cadastrar();
            case 2 ->
            case 3 ->
            case 4 ->
            case 5 ->
        }

    }

    void cadastrar() {
        var nome = IO.readln("digite  o nome: ");
        var saldo = Double.parseDouble(IO.readln("digite o saldo: "));
        var num_con = IO.readln("digite o num consulta: ");

        var novaConta = new Conta_Bancaria(nome, num_con, saldo);
        this.contas.add(novaConta);
    }

    static void main(String[]args){
        App app = new App();
      IO.println( "..:: Menu ::..\n" +
         "1 - cadastrar conta\n"+
         "2 - listar todas as contas\n"+
         "3 - depositar em uma conta\n"+
         "4 - sacar em uma conta\n"+
         "5 - sair");
        var opcao = IO.readln("Entre com uma opcao: ");
        app.menu(1);
    }
}
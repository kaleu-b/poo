package ads.poo.aula12;

import java.util.ArrayList;

public
class App {
    ArrayList<Conta> contas;
    public
    App() { contas = new ArrayList<>(); }

    void menu(int opcao) {
        switch (opcao) {
            case 1 -> cadastrar();
            case 2 -> listar();
            case 3 -> depositar();
            case 4 -> sacar();
            case 5 -> IO.println("ADSDFAS");
        }

    }

    void cadastrar() {
        var nome = IO.readln("digite  o nome: ");
        var saldo = Double.parseDouble(IO.readln("digite o saldo: "));
        var num_con = IO.readln("digite o num consulta: ");

        var novaConta = new Conta(nome, num_con, saldo);
        this.contas.add(novaConta);
    }

    void listar () {
        IO.println(contas.toString());
    }

    void depositar (){
        var i = Integer.parseInt(IO.readln("digite o indice da conta em que deseja depositar: "));
        var v = Integer.parseInt(IO.readln("digite o valor do deposito: "));
        contas.get(i).depositar(v);
    }

    void sacar(){
        var i = Integer.parseInt(IO.readln("digite o indice da conta em que deseja depositar: "));
        var v = Integer.parseInt(IO.readln("digite o valor do deposito: "));
        contas.get(i).sacar(v);
    }

    static void main(String[]args){
        App app = new App();
        int opcao;
        do {
            IO.println( "..:: Menu ::..\n" +
                    "1 - cadastrar conta\n"+
                    "2 - listar todas as contas\n"+
                    "3 - depositar em uma conta\n"+
                    "4 - sacar em uma conta\n"+
                    "5 - sair");
            opcao = Integer.parseInt(IO.readln("Entre com uma opcao: "));
            app.menu(opcao);
        }while (opcao != 5);
    }
}
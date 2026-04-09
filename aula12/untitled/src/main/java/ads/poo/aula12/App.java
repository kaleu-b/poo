package ads.poo.aula12;

import java.util.ArrayList;

public class App {
    ArrayList<Conta> contas;
    public App() {
        contas = new ArrayList<>();
    }

    void menu(int opcao) {
        switch (opcao) {
            case 1 -> cadastrar();
            case 2 -> listar();
            case 3 -> depositar();
            case 4 -> sacar();
            case 5 -> IO.println("Saindo...");
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
        contas.forEach(IO::println);
    }

    void depositar (){
        var v = Integer.parseInt(IO.readln("digite o valor do deposito: "));
        var procura = IO.readln("Digite o número da conta ou o nome da pessoa: ");

        for (Conta c : contas) {
            if (c.isValido(procura)) {
                var saldoAnterior = c.getSaldo();
                c.depositar(v);
                if (c.getSaldo() == saldoAnterior){
                    IO.println("Não foi possível realizar o deposito.");
                }else {
                    IO.println(String.format("Depósito realizado. %.2f -> %.2f", saldoAnterior, c.getSaldo()));
                }
                return;
            }
        }
        IO.println("Conta não encontrada.");
    }

    void sacar() {
        var v = Integer.parseInt(IO.readln("digite o valor do saque: "));
        var procura = IO.readln("Digite o número da conta ou o nome da pessoa:");

        for (Conta c : contas) {
            var saldoAnterior = c.getSaldo();
            if (c.isValido(procura)) {
                c.sacar(v);
                if (c.getSaldo() == saldoAnterior){
                    IO.println("Não foi possível realizar o saque.");
                }else {
                    IO.println(String.format("Saque realizado. %.2f -> %.2f", saldoAnterior, c.getSaldo()));
                }
                return;
            }
        }
        IO.println("Conta não encontrada.");
    }

    static void main(String[] args) {
        App app = new App();
        int opcao;
        do {
            IO.println("..:: Menu ::..\n"
                    + "1 - cadastrar conta\n"
                    + "2 - listar todas as contas\n"
                    + "3 - depositar em uma conta\n"
                    + "4 - sacar em uma conta\n"
                    + "5 - sair");
            opcao = Integer.parseInt(IO.readln("Entre com uma opcao: "));
            app.menu(opcao);
        } while (opcao != 5);
    }
}
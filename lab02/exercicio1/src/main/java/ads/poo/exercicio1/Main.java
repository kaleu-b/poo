package ads.poo.exercicio1;

public class Main {
    static void main() {

        int dia = Integer.parseInt(IO.readln("Digite o dia: "));
        String mes = IO.readln("Digite as primeiras tres letras do mes: ").toLowerCase();

        IO.println(dia + " " + mes);

        if (mes.equals("dez") && dia >= 21 || mes.equals("jan") || mes.equals("fev") || mes.equals("mar") && dia <= 22)
        {
            IO.readln("verão");
        }
        else if (mes.equals("mar") && dia >= 23 || mes.equals("abr") || mes.equals("maio") || mes.equals("jun") && dia <= 21 )
        {
            IO.readln("outono");
        }
        else if (mes.equals("jun") && dia > 21 || mes.equals("jul") || mes.equals("ago") || mes.equals("set") && dia <= 21)
        {
            IO.readln("Inverno");
        }else
        {
            IO.readln("Primavera");
        }

    }
    }


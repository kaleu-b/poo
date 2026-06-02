package ads.poo.aula26.exceptionsExemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a,b;

        try{

            System.out.println("Entre com o numero a:");
            a = ler.nextInt();
            System.out.println("Entre com o número b:");
            b = ler.nextInt();

            int res = a/b;

            System.out.println(a + " dividido por " + b + "=" + res);
        }
        catch (InputMismatchException TiposDiferentes) {
            System.err.println("Erro: Tipos de dados não numéricos");
            System.err.println(TiposDiferentes.getMessage());
        }
        catch (ArithmeticException e){
            System.err.println("Erro: Divisão por 0.");
        }
        catch (Exception e){
            System.err.println("Erro");
        }

    }
}

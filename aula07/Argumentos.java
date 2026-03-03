public class Argumentos {
    public static void main(String[] args) {
        if (args.length == 0){
            IO.println("ERRO!!! nenhum argumento fornecido");
        }else{
            IO.print("Argumentos: ");
            for (String arg : args) {
                IO.print(arg + " ");
            }
        }
    }
}
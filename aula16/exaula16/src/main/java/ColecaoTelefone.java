import java.util.HashMap;
import java.util.Map;

public class ColecaoTelefone {
    // hashmap com os dados de telefone(s) do contato
    private HashMap<String, String> dados;
    // template que verifica se um telefone é valido usado regex
    //private static final String telefoneRegex = "^[0-9]+${11}";

    // construtor que inicia o hashmap vazio
    public ColecaoTelefone() {
        dados = new HashMap<>();
    }

    // adiciona o numero de telefone caso ele não exista e caso seja um número válido
    public boolean add(String rotulo, String valor) {

            if (!dados.containsKey(rotulo)) {
                dados.put(rotulo, valor);
                return true;
            }

        return false;
    }

    // remove um numero usando a chave do hashmap
    public boolean remove(String rotulo) {
        if (dados.containsKey(rotulo)) {
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    // atualiza um numero caso ele exista no mapa e se o numero novo for valido
    public boolean update(String rotulo, String valor) {
        if (dados.containsKey(rotulo)) {
                dados.replace(rotulo, valor);
                return true;
        }
        return false;
    }

    /* valida o numero de telefone (11 caracteres, somente numeros)
    private boolean validaTelefone(String e) {
        return e.matches(telefoneRegex);
    }*/

    // mostra os numeros em uma coleção junto com os rotulos
    // TODO: mostrar o rótulo e o número
    // ex:
    // Pessoal : 4893382822
    // Trabalho : 7998698769
    // Pessoal tim : 0798696
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : dados.entrySet()){
            sb.append(entry.getKey());
            sb.append(" : ");
            sb.append(entry.getValue());
            sb.append("\n");
       }
    return sb.toString();
    }
}

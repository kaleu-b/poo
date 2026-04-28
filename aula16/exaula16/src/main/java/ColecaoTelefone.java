import java.util.HashMap;

public class ColecaoTelefone {
    // hashmap com os dados de telefone(s) do contato
    private HashMap<String, String> dados;
    // template que verifica se um email é valido usado regex
    private static final String emailRegex = "^[0-9]+${11}";
    // adiciona o numero de telefone caso ele não exista
    public boolean add(String rotulo, String valor){
        if (validaTelefone(valor)){
            dados.putIfAbsent(rotulo, valor);
            return true;
        }
        return false;
    }
    // remove um numero usando a chave do hashmap
    public boolean remove(String rotulo){
      if (dados.containsKey(rotulo)){
          dados.remove(rotulo);
          return true;
      }
      return false;
    }
    // atualiza um numero caso ele exista no mapa e se o numero novo for valido
    public boolean update(String rotulo, String valor){
        if(dados.containsKey(rotulo)){
           if (validaTelefone(valor)){
              dados.replace(rotulo, valor);
              return true;
           }
        }
        return false;
    }
    // valida o numero de telefone (11 caracteres, somente numeros)
    private static boolean validaTelefone(String e){
        return e.matches(emailRegex);
    }

}

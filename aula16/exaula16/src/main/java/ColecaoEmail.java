import java.util.HashMap;
import java.util.Map;

public class ColecaoEmail {
    // hashmap que guarda os emails
    private HashMap<String, String> dados;
    // string que será usada para verificar se um email é válido ou não
    //private static final String templateEmail =  "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    // construtor que inicia um hashmap vazio
    public ColecaoEmail(){
        dados = new HashMap<>();
    }
    // verifica se um email é válido com base num template
    /*private boolean validaEmail(String v){
      return v.matches(templateEmail);
    }*/
    // adiciona um email caso seja um email válido e se o rótulo dele já não existir
    public boolean add(String rotulo, String email){

            if(!dados.containsKey(rotulo)){
                dados.put(rotulo, email);
                return true;
            }

        return false;
    }
    // atualiza um email se o valor novo for válido e se o rótulo já existe
    public boolean update(String rotulo, String valor){

            if(dados.containsKey(rotulo)){
                dados.replace(rotulo, valor);
                return true;
            }

        return false;
    }
    // remove caso exista a chave
    public boolean remove(String rotulo){
        if(dados.containsKey(rotulo)) {
            dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public String toString(){
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
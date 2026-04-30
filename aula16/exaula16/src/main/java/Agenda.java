import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c){
        contatos.add(c);
        return true;
    }

    public ArrayList<Contato> findContato(String nome, String sobrenome){
       ArrayList<Contato> resultado = new ArrayList<>();
        for (Contato c: contatos){
           if(c.getNome().equalsIgnoreCase(nome) && c.getSobrenome().equalsIgnoreCase(sobrenome)){
                resultado.add(c);
           }
       }
        return resultado;
    }

    public boolean removeContato(int index){
        if ( contatos.get(index) != null ){
            contatos.remove(index);
            return true;
        }
        return false;
    }

    public boolean addTelefone(String rotulo, String valor, int indice){
           return contatos.get(indice).addTelefone(rotulo, valor);
    }

    public boolean addEmail(String rotulo, String valor, int indice){
        return contatos.get(indice).addEmail(rotulo, valor);
    }

    public boolean updateTelefone(String rotulo, String valor, int indice){
        return contatos.get(indice).updateTelefone(rotulo, valor);
    }

    public boolean updateEmail(String rotulo, String valor, int indice){
        return contatos.get(indice).updateEmail(rotulo, valor);
    }

    public boolean removeTelefone(String rotulo, int indice){
        return contatos.get(indice).removeTelefone(rotulo);
    }

    public boolean removeEmail(String rotulo, int indice){
        return contatos.get(indice).removeEmail(rotulo);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("---------Contatos----------------");
        sb.append("\n");
        contatos.forEach(e -> {
            sb.append(e.toString());
        });
        return sb.toString();
    }
}
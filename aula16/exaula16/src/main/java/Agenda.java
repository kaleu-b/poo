import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos;

    public Agenda(){
        contatos = new ArrayList<>();
    }

    public boolean addContato(Contato c){
        contatos.add(c);
        return true;
    }

}
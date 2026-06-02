package ads.poo.aula26;

public class Caixa<T> {

    private T conteudo;

    public Caixa(T obj){
     this.conteudo = obj;
    }

    public void setConteudo(T obj){
        this.conteudo = obj;
    }

    public T getConteudo(){
        return this.conteudo;
    }

}
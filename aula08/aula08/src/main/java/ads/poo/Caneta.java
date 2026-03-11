package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberta;
    //public String[][] coordenadas;

    public boolean isAberta(){
        return aberta;
    }

    public void abreTampa(){
        aberta = true;
    }

    public void fecharTampa(){
        aberta = false;
    }

   public void setCor(String c){
        cor = c;
   }

   public String getCor(){
        return cor;
   }

   public void setNivelTinta(double nivel){
        nivelTinta = nivel;
   }

   public double getNivelTinta (){
        return nivelTinta;
   }

   public String desenhar( int x1, int y1, int x2, int y2){
        if (aberta){
            //calcula distancia
            double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            //calcula consumo (0.10% por cm desenhado)
            double consumo = distancia * 0.1
               if (nivelTinta >= consumo){
                   //debita o nivel da tinta
                   nivelTinta -= consumo;
                   //retorna os cm desenhados
                   return String.format("desenhei %.2fcm na cor %s", distancia, cor);
               }
            //se não tem tinta, retorna essa mensagem
            return "tinta insuficiente";
        }
        //se a caneta não estiver aberta, retorna essa mensagem
        return "caneta está fechada, abra ela!";
    }
}
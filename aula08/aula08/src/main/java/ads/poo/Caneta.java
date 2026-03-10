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
       //calc. distancia
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (isAberta() && !(distancia * 0.1 > nivelTinta) ) {
            // debitar o nivel da tinta
            nivelTinta -= distancia * 0.01;
            // retorna distancia percorrida
            return String.format("desenhei %.2fcm na cor %s", distancia, cor);
            // ex: desenhei 1cm na cor azul
        }else  if (!isAberta()){
            return "caneta fechada, não dá pra desenhar :(";
        }else{
            return "tinta insuficiente :((";
        }
    }
}
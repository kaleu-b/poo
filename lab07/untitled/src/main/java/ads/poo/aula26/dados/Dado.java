package ads.poo.aula26.dados;

import java.util.ArrayList;
import java.util.Random;

public class Dado {
    private int face;
    private ArrayList<Integer> est;
    private Random r;

    public Dado(ArrayList<Integer> est, int face) {
        this.est = est;
        this.face = face;
        this.r = new Random();
    }

    protected void girar(){
        face = r.nextInt(6);
        addEstatistica(face);
    }

    protected void addEstatistica(int num){
        est.add(num);
    }

}
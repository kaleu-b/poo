package ads.poo.aula26.dados;

import java.util.ArrayList;
import java.util.Random;

public class Dado {
    protected int face;
    protected ArrayList<Integer> est;
    protected Random r;

    public Dado() {
        this.r = new Random();
        this.est = new ArrayList<>();
        this.face = sortear();
    }

    public void girar() {
        face = sortear();
        addEstatistica(face);
    }

    protected int sortear(){
        return r.nextInt(7);
    }

    protected void addEstatistica(int num) {
        est.add(num);
    }
}
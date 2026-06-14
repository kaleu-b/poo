package ads.poo.aula26.dados;

import ads.poo.aula26.ObjDesenho;
import edu.princeton.cs.algs4.Draw;

import java.util.ArrayList;

public class DadoGrafico extends Dado implements ObjDesenho {

    private double x,y;

    public DadoGrafico(ArrayList<Integer> est, int face) {
        super(est, face);
    }

    @Override
    public void desenhar(Draw d) {
        try{

        }catch (Exception e){

        }
    }

    @Override
    public boolean clicou(double x, double y) {
        return false;
    }
}
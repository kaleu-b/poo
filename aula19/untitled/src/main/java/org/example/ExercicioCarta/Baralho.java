package org.example.ExercicioCarta;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Baralho {

    ArrayList cartas = new ArrayList<>();

    public static int MAX_CARTAS = 52;


    public Baralho(){
       
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Baralho{");
        sb.append("cartas=").append(Arrays.toString(cartas));
        sb.append('}');
        return sb.toString();
    }
}

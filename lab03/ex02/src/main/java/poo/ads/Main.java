package poo.ads;


public class Main {
    static void main() {
        Horario h = new Horario((short)1,(short)1,(short)1);
        Horario i = new Horario((short)24,(short)2,(short)12);
        Horario j = new Horario((short) 12);

        h.setHora((short)12);
        IO.println(j.toString());
        IO.println( i.diffSegundos(j));

        IO.println(h.toExtenso());

        h.setHora((short)2);
        h.setMinuto((short) 2);
        h.setSegundo((short) 2);

        IO.println(h.toExtenso());

        h.setHora((short)10);
        h.setMinuto((short) 10);
        h.setSegundo((short) 20);

        IO.println(h.toExtenso());
    }
}

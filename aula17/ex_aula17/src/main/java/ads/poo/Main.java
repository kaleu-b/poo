package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    static void main() throws InterruptedException {
        Draw draw = new Draw();
        draw.setCanvasSize(800,800);
        draw.setYscale(0,800);
        draw.setXscale(0,800);
    /*    draw.circle(400, 400, 200);
        draw.setPenColor(Color.RED);
        draw.filledCircle(400, 400, 100);
        draw.setPenColor(Color.BLUE);
        draw.filledRectangle(400, 400, 50, 50);
        draw.setPenColor(Color.MAGENTA);
        draw.filledCircle(400, 400, 25);
        double[] x = {100,150,250,300};
        double[] y = {100, 150, 150, 100};
        draw.polygon(x, y);
    */
        draw.enableDoubleBuffering();

        for (int i = 0; i <= 10; i++) {
            draw.clear();
            draw.text(400,400, "" + i);
            draw.show();
            TimeUnit.SECONDS.sleep(1);
        }

        draw.setPenColor(Color.red);
        draw.filledCircle(300, 300, 100);
        draw.filledCircle(400, 300, 100);
        draw.show();
    }
}

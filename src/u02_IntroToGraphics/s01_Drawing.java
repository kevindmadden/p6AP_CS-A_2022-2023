package u02_IntroToGraphics;

import java.awt.*;

public class s01_Drawing {
    public static void main(String[] args) {

        StdDraw.setPenRadius(0.05); //0.05 is a parameter
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenColor(new Color(134, 255, 97) );
        StdDraw.point(0.5, 0.5); //0.5 and 0.5 are parameters
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.2, 0.8, 0.2);



    }
}
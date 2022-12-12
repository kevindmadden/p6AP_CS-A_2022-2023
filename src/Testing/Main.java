package Testing;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering();
        Circle circle1 = new Circle(0, 0, 7, 20, 20);
        Circle circle2 = new Circle(50, 50, 7, 20, 20);
        Circle circle3 = new Circle(70, 70, 7, 20, 20);



        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            circle1.calculate();
            circle2.calculate();
            circle3.calculate();

            circle1.draw();
            circle2.draw();
            circle3.draw();


            //All of these method calls accomplish the exact same thing:
            //  bagel.areCirclesColliding(basketBall); //non-static
            // basketBall.areCirclesColliding(bagel); //non-static
            //   Circle.areCirclesColliding(bagel, basketBall); //static




            //Static method call
            if (Circle.areCirclesColliding(circle1, circle2)) {
                StdDraw.setPenColor(Color.red);
                StdDraw.text(50,50,"massive ratio");
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
            }


            if (Circle.areCirclesColliding(circle1, circle3)) {
                StdDraw.setPenColor(Color.blue);
                StdDraw.text(50,50,"massive W");
            } else {
                StdDraw.setPenColor(StdDraw.BLACK);
            }






            StdDraw.show();
            StdDraw.pause((int) (timeElapsed * 1000));
            StdDraw.clear();         }
    }



}

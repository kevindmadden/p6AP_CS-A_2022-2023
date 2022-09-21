package u03_ObjectsAndClasses;

public class Main {

    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        BouncingCircle circle1 = new BouncingCircle(20, 20, 5, 20, 20);
        circle1.xPos = 25;
        circle1.setXPos(25);
        System.out.println(circle1.xPos);
        System.out.println(circle1.getSetXPos());

        BouncingCircle circle2 = new BouncingCircle(40, 40, 7, 20, 20);
        BouncingCircle circle3 = new BouncingCircle(80, 40, 7, 100, 20);



        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {

            circle1.calculate();
            circle2.calculate();
            circle3.calculate();
            circle1.draw();
            circle2.draw();
            circle3.draw();

            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}
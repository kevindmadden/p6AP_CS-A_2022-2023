package u02_IntroToGraphics;

public class s04_BouncingAnimation {

    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        double xPos = 10; //px
        double xVel = 80; // px/sec

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            xPos = xPos + xVel*timeElapsed;
            //System.out.println(xPos);
            if(xPos > 100-5){
                xVel = Math.abs(xVel)*-1;
            }
            if(xPos < 0+5){
                xVel = Math.abs(xVel);
            }

            StdDraw.square(xPos, 50, 5);

            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear();
        }
    }



}
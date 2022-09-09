package u02_IntroToGraphics;
/*
    Use compound boolean expressions.
    && - and
    || - or
     ! - not

     Reading: 3.10

 */

public class s05_MouseCoordinates {
    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        double xPosSq1 = 50;
        double yPosSq1 = 50;
        double halfWidthSq1 = 10;
        double xVelSq1 = 30;
        double yVelSq1 = 10;


        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            xPosSq1 = xPosSq1 + xVelSq1*timeElapsed;
            yPosSq1 = yPosSq1 + yVelSq1*timeElapsed;

            double mouseX = StdDraw.mouseX(); //this method **returns** the x-coordinate
            double mouseY = StdDraw.mouseY();
            System.out.println(mouseX);

            /*if(mouseX > 45){
                if(mouseX < 55){
                    System.out.println("in square");
                }
            }*/

            if(isMouseInSquare(xPosSq1,yPosSq1,halfWidthSq1)){
                System.out.println("in square");
                StdDraw.setPenColor(StdDraw.RED);
            }else{
                StdDraw.setPenColor(StdDraw.BLACK);
            }

            if(mouseY > 55 || mouseY < 45){
                StdDraw.filledRectangle(50,100, 50, 45);
            }


            StdDraw.square(xPosSq1,yPosSq1,halfWidthSq1);



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static boolean isMouseInSquare(double xCenter, double yCenter, double halfWidth){
        double xCoordOfLeftSide = xCenter-halfWidth;
        double xCoordOfRightSide = xCenter+halfWidth;
        double yCoordOfTopSide = yCenter+halfWidth;
        double yCoordOfBottomSide = yCenter-halfWidth;

        double mouseX = StdDraw.mouseX();
        double mouseY = StdDraw.mouseY();

        if(mouseX > xCoordOfLeftSide && mouseX < xCoordOfRightSide && mouseY > yCoordOfBottomSide && mouseY < yCoordOfTopSide){
            return true;
        }
        return false;
    }

}

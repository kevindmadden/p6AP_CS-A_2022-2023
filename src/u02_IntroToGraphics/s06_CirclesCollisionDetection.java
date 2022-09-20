package u02_IntroToGraphics;

public class s06_CirclesCollisionDetection {

    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        double xDonut = 60;
        double yDonut = 70;
        double rDonut = 10;
        double xVelDonut = 50;
        double yVelDonut = 50;

        double xCoin = 20;
        double yCoin = 30;
        double rCoin = 5;
        double xVelCoin = 70;
        double yVelCoin = 70;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            xDonut += xVelDonut*timeElapsed;
            yDonut += yVelDonut*timeElapsed;
            xCoin += xVelCoin*timeElapsed;
            yCoin += yVelCoin*timeElapsed;

            if(xDonut < 0+rDonut){
                xVelDonut = Math.abs(xVelDonut);
            }
            if(xDonut > 100-rDonut){
                xVelDonut = -Math.abs(xVelDonut);
            }
            if(yDonut < 0+rDonut){
                yVelDonut = Math.abs(yVelDonut);
            }
            if(yDonut > 100-rDonut){
                yVelDonut = -Math.abs(yVelDonut);
            }
            if(xCoin < 0+rCoin){
                xVelCoin = Math.abs(xVelCoin);
            }
            if(xCoin > 100-rCoin){
                xVelCoin = -Math.abs(xVelCoin);
            }
            if(yCoin < 0+rCoin){
                yVelCoin = Math.abs(yVelCoin);
            }
            if(yCoin > 100-rCoin){
                yVelCoin = -Math.abs(yVelCoin);
            }

            StdDraw.setPenColor(StdDraw.RED);
            if(areCirclesColliding(xDonut,yDonut,rDonut,xCoin,yCoin,rCoin)){
                StdDraw.setPenColor(StdDraw.BLUE);
            }

            StdDraw.filledCircle(xDonut, yDonut, rDonut);
            StdDraw.filledCircle(xCoin, yCoin, rCoin);


            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static boolean areCirclesColliding(double x1, double y1, double r1, double x2, double y2, double r2){
        if(Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) ) < r1 + r2 ){
            return true;
        }
        return false;
    }

}
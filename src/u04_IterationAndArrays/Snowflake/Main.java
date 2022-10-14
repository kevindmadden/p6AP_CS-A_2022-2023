package u04_IterationAndArrays.Snowflake;

public class Main {

    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        Snowflake[] snowflakes = new Snowflake[100];
        for(int i=0; i<100; i++){
            snowflakes[i] = new Snowflake();
        }

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledSquare(50,50,50);

            for(Snowflake snowflake : snowflakes){
                snowflake.calculate(timeElapsed);
                snowflake.draw();
            }

            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static boolean didCirlecRectColl(double rect_x, double rect_y, double rect_halfWidth, double rect_halfHeight, double circle_x, double circle_y, double circle_r) {
        rect_x = rect_x - rect_halfWidth;
        rect_y = rect_y - rect_halfHeight;
        double rect_w = rect_halfWidth*2;
        double rect_h = rect_halfHeight*2;
        double distX = Math.abs(circle_x - rect_x - rect_w / 2);
        double distY = Math.abs(circle_y - rect_y - rect_h / 2);

        if (distX > (rect_w / 2 + circle_r)) {
            return false;
        }
        if (distY > (rect_h / 2 + circle_r)) {
            return false;
        }

        if (distX <= (rect_w / 2)) {
            return true;
        }
        if (distY <= (rect_h / 2)) {
            return true;
        }

        double dx = distX - rect_w / 2;
        double dy = distY - rect_h / 2;
        return (dx * dx + dy * dy <= (circle_r * circle_r));
    }

    public static boolean didCircleCircleColl(double cir1_x, double cir1_y, double cir1_r, double cir2_x, double cir2_y, double cir2_r) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(cir2_x - cir1_x, 2) + Math.pow(cir2_y - cir1_y, 2));
        double sumOfRadii = cir1_r + cir2_r;

        if (distanceBetweenCenters > sumOfRadii) {
            return false;
        } else {
            return true;
        }
    }
}
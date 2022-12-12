import java.awt.*;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private double r;

    // private static int totalFlakesL;
    //private static int totalFlakesR;
    private static int totalFlakes[]= new int[10];
    //static int bucket;

    // private static int bucket[] = new int[10];


    public Snowflake() {
        xPos = 1;
        yPos = Math.random() * 100;
        xVel = Math.random() * 6.5; //* -10;
        yVel = -50;
        r = 1;
    }

    public void drawSnow() {
        StdDraw.setPenColor(Color.white);
        StdDraw.filledCircle(xPos, yPos, r);
    }

    public void calculate(double time) {
        yPos = yPos + yVel * time;
        xPos = xPos + xVel * time;
        for(int i = 0;i<10; i++){
            if (yPos < 0) {
                if (xPos > (i * 10) && xPos < ((i * 10)+10)) {
                    totalFlakes[i]++;
                }

                xPos = -(xPos + xVel * time);
            }
        }

        // if (yPos < 0) {
        // if (xPos > 0 && xPos < 10) {
        //totalFlakes[i]++;
       /*     if (xPos > 0 && xPos < 10) {
                totalFlakes[0]++;
            }else if (xPos > 10 && xPos < 20) {
                totalFlakes[1]++;
            }else if (xPos > 20 && xPos < 30) {
                totalFlakes[2]++;
            }else if (xPos > 30 && xPos < 40) {
                totalFlakes[3]++;
            }else if (xPos > 40 && xPos < 50) {
                totalFlakes[4]++;
            }else if (xPos > 50 && xPos < 60) {
                totalFlakes[5]++;
            }else if (xPos > 60 && xPos < 70) {
                totalFlakes[6]++;
            }else if (xPos > 70 && xPos < 80) {
                totalFlakes[7]++;
            }else if (xPos > 80 && xPos < 90) {
                totalFlakes[8]++;
            }else if (xPos > 90 && xPos < 100) {
                totalFlakes[9]++;
            }*/
        // yPos = 110;
        //  xPos = -(xPos + xVel * time);
        // }
    }



    public static void drawSnowBuild(){
        for(int i = 0; i < 10; i++) {
            StdDraw.setPenColor(Color.white);
            StdDraw.filledRectangle(5 + (i*10), 0, 6, totalFlakes[i]*20);
        }
        /*StdDraw.filledRectangle(5,0,6, totalFlakes[0]/25);
        StdDraw.filledRectangle(15,0,6, totalFlakes[1]/25);
        StdDraw.filledRectangle(25,0,6, totalFlakes[2]/25);
        StdDraw.filledRectangle(35,0,6, totalFlakes[3]/25);
        StdDraw.filledRectangle(45,0,6, totalFlakes[4]/25);
        StdDraw.filledRectangle(55,0,6, totalFlakes[5]/25);
        StdDraw.filledRectangle(65,0,6, totalFlakes[6]/25);
        StdDraw.filledRectangle(75,0,6, totalFlakes[7]/25);
        StdDraw.filledRectangle(85,0,6, totalFlakes[8]/25);
        StdDraw.filledRectangle(95,0,6, totalFlakes[9]/25);*/
    }

    /*public static void drawSnowBuild(){
        StdDraw.setPenColor(Color.white);
        StdDraw.filledRectangle(25,0,25, totalFlakesL/100);
        StdDraw.filledRectangle(75,0,25, totalFlakesR/100);
    }*/

}

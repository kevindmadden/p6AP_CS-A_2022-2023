package u03_ObjectsAndClasses;

public class BouncingCircle {
    public double xPos;
    public double yPos;
    public double radius;
    public double xVel;
    public double yVel;

    public BouncingCircle(double xPos, double yPos, double radius, double xVel, double yVel){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public BouncingCircle(){
        xPos = 50;
        yPos = 50;
        radius = 5;
        xVel = 10;
        yVel = 10;
    }



    public void draw(){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(xPos, yPos, radius);
    }

    public void calculate(){
        double timeElapsed = 0.017;
        xPos = xPos + xVel*timeElapsed;
        yPos = yPos + yVel*timeElapsed;

    }

}

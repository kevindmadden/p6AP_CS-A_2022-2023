package u03_ObjectsAndClasses;

public class BouncingCircle {
    //instance variables
    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;

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

        if(xPos < 0+radius){
            xVel = Math.abs(xVel);
        }
        if(xPos > 100-radius){
            xVel = -Math.abs(xVel);
        }
        if(yPos < 0+radius){
            yVel = Math.abs(yVel);
        }
        if(yPos > 100-radius){
            yVel = -Math.abs(yVel);
        }
        
    }

    public void setXPos(double xPos){
        this.xPos = xPos;
    }

    public double getSetXPos(){
        return this.xPos;
    }

}

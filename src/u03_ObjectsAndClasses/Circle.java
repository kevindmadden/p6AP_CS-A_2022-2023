package u03_ObjectsAndClasses;

public class Circle {
    //instance variables
    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;

    public Circle(double xPos, double yPos, double radius, double xVel, double yVel){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        this.xVel = xVel;
        this.yVel = yVel;
    }

    public void draw(){
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

    public boolean areCirclesColliding(Circle circle2){
        double x1 = xPos;
        double y1 = yPos;
        double r1 = radius;
        double x2 = circle2.xPos;
        double y2 = circle2.yPos;
        double r2 = circle2.radius;

        if(Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) ) < r1 + r2 ){
            return true;
        }
        return false;
    }

    public static boolean areCirclesColliding(Circle circle1, Circle circle2){
        //System.out.println("circle1: "+circle1.xPos+", "+circle1.yPos);
        //System.out.println("circle2: "+circle2.xPos+", "+circle2.yPos);
        double x1 = circle1.xPos;
        double y1 = circle1.yPos;
        double r1 = circle1.radius;
        double x2 = circle2.xPos;
        double y2 = circle2.yPos;
        double r2 = circle2.radius;

        if(Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2) ) < r1 + r2 ){
            return true;
        }
        return false;
    }
}

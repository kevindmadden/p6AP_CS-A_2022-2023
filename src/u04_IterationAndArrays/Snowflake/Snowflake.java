package u04_IterationAndArrays.Snowflake;

public class Snowflake {
    private double xPos;
    private double yPos;
    private double yVel;

    public Snowflake(){
        yVel = -20;
        xPos = Math.random()*100;
        yPos = 100;
    }

    public void calculate(double timeElapsed){
        yPos = yPos + yVel*timeElapsed;
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledCircle(xPos, yPos, 1);
    }

}

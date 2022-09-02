package u02_IntroToGraphics;

public class s02_VoidMethods {

    public static void main(String[] args){
        StdDraw.setScale(0,100);

        drawCube(0,0);
        drawCube(50,50);
        drawCube();
    }

    public static void drawCube(int xOffset, int yOffset){
        StdDraw.square(5+xOffset,5+yOffset,5);
        StdDraw.square(10+xOffset,10+yOffset,5);
        StdDraw.line(0+xOffset,10+yOffset,5+xOffset,15+yOffset);
        StdDraw.line(0+xOffset,0+yOffset,5+xOffset, 5+yOffset);
        StdDraw.line(10+xOffset,0+yOffset,15+xOffset, 5+yOffset);
        StdDraw.line(10+xOffset,10+yOffset,15+xOffset, 15+yOffset);
    }

    //In this context, this method isn't particularly useful. However, if you really wanted to create a drawCube method where you don't have to pass in any parameters and just want it to default to a 0, 0 offset, this is how you could do it.
    public static void drawCube(){
        drawCube(0,0);
    }

}

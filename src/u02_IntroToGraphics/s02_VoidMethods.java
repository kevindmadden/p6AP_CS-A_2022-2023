package u02_IntroToGraphics;

public class s02_VoidMethods {

    public static void main(String[] args){
        StdDraw.setScale(0,100);

        System.out.println("start of main");
        drawCube();
        drawCube(0,0);
        drawCube(50,50);

        System.out.println("after cube method");

    }

    public static void drawCube(){
        drawCube(0,0);
    }

    public static void drawCube(int xOffset, int yOffset){
        StdDraw.square(5+xOffset,5+yOffset,5);
        StdDraw.square(10+xOffset,10+yOffset,5);
        StdDraw.line(0+xOffset,10+yOffset,5+xOffset,15+yOffset);
        StdDraw.line(0+xOffset,0+yOffset,5+xOffset, 5+yOffset);
        StdDraw.line(10+xOffset,0+yOffset,15+xOffset, 5+yOffset);
        StdDraw.line(10+xOffset,10+yOffset,15+xOffset, 15+yOffset);
    }

}

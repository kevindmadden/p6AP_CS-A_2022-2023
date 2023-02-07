package u05_Checkers;

import java.awt.*;

public class Checker {
    private int playerNum;
    private boolean isKing;
    private boolean isHighlighted;

    public Checker(int playerNum){
        this.playerNum = playerNum;
    }

    public void draw(int row, int col){
        if(playerNum==1){
            StdDraw.setPenColor(new Color(0, 0, 0));
        }else{
            StdDraw.setPenColor(new Color(218, 21, 21));
        }
        StdDraw.filledCircle(5+10*col,75-10*row, 4);
        if(isHighlighted){
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.circle(5+10*col,75-10*row, 4);
        }
    }

    public void setIsHighlighted(boolean isHighlighted){
        this.isHighlighted = isHighlighted;
    }
}

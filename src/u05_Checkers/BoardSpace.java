package u05_Checkers;

import java.awt.*;

public class BoardSpace {
    private boolean isHighlighted;
    private Color color;
    private Checker checker;

    public BoardSpace(){
        isHighlighted = false;
    }

    public void setChecker(Checker checker){
        this.checker = checker;
    }

    public Checker getChecker(){
        return this.checker;
    }

    public void setIsHighlighted(boolean isHighlighted){
        this.isHighlighted = isHighlighted;
    }

    public boolean getIsHighlighted(){
        return isHighlighted;
    }


    public void draw(int row, int col){
        /*y-coord: 80-5-10*row
        //x-coord: 0+5+10&col
        // [row][col]: (5+10*col,75-10*row)
        // [0][0]: ( 5,75)
        // [0][1]: (15,75)
        // [0][2]: (25,75)
        // [0][0]: ( 5,75)
        // [1][0]: ( 5,65)
        // [2][0]: ( 5,55)*/

        if((row+col)%2==0){
            StdDraw.setPenColor(new Color(255, 243, 203));
        }else{
            StdDraw.setPenColor(new Color(66, 5, 5));
        }

        StdDraw.filledSquare(5+10*col,75-10*row,5);
        StdDraw.setPenColor(new Color(218, 215, 28));
        StdDraw.setPenRadius(.008);
        if(isHighlighted){
            StdDraw.square(5+10*col,75-10*row,5);
        }


        if(this.checker != null){
            checker.draw(row, col);
        }
    }
}

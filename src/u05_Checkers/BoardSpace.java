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




    public void draw(int row, int col){
        //y-coord: 80-5-10*row
        //x-coord: 0+5+10&col
        // [row][col]: (5+10*col,75-10*row)
        // [0][0]: ( 5,75)
        // [0][1]: (15,75)
        // [0][2]: (25,75)
        // [0][0]: ( 5,75)
        // [1][0]: ( 5,65)
        // [2][0]: ( 5,55)

        if((row+col)%2==0){
            StdDraw.setPenColor(new Color(245, 223, 135));
        }else{
            StdDraw.setPenColor(new Color(68, 3, 3));
        }

        StdDraw.filledSquare(5+10*col,75-10*row,5);

        if(this.checker != null){
            checker.draw(row, col);
        }

        //StdDraw.filled
    }
}

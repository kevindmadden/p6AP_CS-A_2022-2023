package u05_Checkers;

/*
-We want it to work so that we can code AI's
-Check whether moving a checker to a particular spot is valid
-We have to figure forced jumps
    -Highlight checkers that could be moved
-What are we going to store in 2d array?
    -Things to address
        -Is a checker highlighted or not?
        -Is a space highlighted or not for the potential to move there.
        -Is it a king or not? (null could be helpful) And of what color? And have that affect movement...
        -How to switch turns?
        -How to make it so your turn gets skipped if you can't move?
            -If no checkers are highlighted, then that means above
        -How to make AI?
    -We need a way of eliminating other checkers
    -Method #1
        -char array where each character represent the state of a space
            -O,B (black) ,R (red), C (black king), S (red king)
        -Potentially have two different parallel 2d arrays
    -Method #2
        -Main class
            -2d Array of boardSpaces would be stored here
        -Board Spaces
        -Each Boards Space can Store a Checker
        -Board Spaces Class
            -Whether space is highlighted
            -Color space
            -What checker (or null) is located in that space
        -We could store board spaces in a grid in a 2d array
        -Checker Class
            -Player checker belongs to
            -isKing
            -Track whether checker is highlights in order to track mandatory jumps
 */

import java.awt.*;

public class Main {
    public static void main(String[] args){
        BoardSpace[][] board = new BoardSpace[8][8];
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                board[row][col] = new BoardSpace();
            }
        }

        //Initial Starting points for player 1 checkers
        board[0][0].setChecker(new Checker(1));
        board[0][2].setChecker(new Checker(1));
        board[0][4].setChecker(new Checker(1));
        board[0][6].setChecker(new Checker(1));
        board[2][0].setChecker(new Checker(1));
        board[2][2].setChecker(new Checker(1));
        board[2][4].setChecker(new Checker(1));
        board[2][6].setChecker(new Checker(1));
        board[1][1].setChecker(new Checker(1));
        board[1][3].setChecker(new Checker(1));
        board[1][5].setChecker(new Checker(1));
        board[1][7].setChecker(new Checker(1));

        //Player 2
        board[5][1].setChecker(new Checker(2));
        board[5][3].setChecker(new Checker(2));
        board[5][5].setChecker(new Checker(2));
        board[5][7].setChecker(new Checker(2));
        board[7][1].setChecker(new Checker(2));
        board[7][3].setChecker(new Checker(2));
        board[7][5].setChecker(new Checker(2));
        board[7][7].setChecker(new Checker(2));
        board[6][0].setChecker(new Checker(2));
        board[6][2].setChecker(new Checker(2));
        board[6][4].setChecker(new Checker(2));
        board[6][6].setChecker(new Checker(2));



                StdDraw.setScale(0, 80);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.


        boolean isMousePressed = false;


        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            if(StdDraw.isMousePressed()){
                isMousePressed = true;
            }

            //TODO: Clicking somewhere else unhighlights checker/squares
            for(int row=0; row<8; row++) {
                for (int col = 0; col < 8; col++) {

                }
            }

            for(int row=0; row<8; row++){
                for(int col=0; col<8; col++){
                    if(isMousePressed && isPointInSquare(StdDraw.mouseX(), StdDraw.mouseY(),5+10*col,75-10*row,10)){
                        Checker tempChecker = board[row][col].getChecker();
                       if(tempChecker != null){
                           tempChecker.setIsHighlighted(true);
                           //Up-right
                           if(col+1<8 && board[row-1][col+1].getChecker()==null){
                               board[row-1][col+1].setIsHighlighted(true);
                           }
                           //Up-left
                           if(col-1>=0 && board[row-1][col-1].getChecker()==null){
                               board[row-1][col-1].setIsHighlighted(true);
                           }

                       }
                        isMousePressed = false;
                    }
                }
            }

            //Draw red bg
            StdDraw.setPenColor(new Color(93, 7, 7));
            StdDraw.filledSquare(40,40,40);

            for(int row=0; row<8; row++){
                for(int col=0; col<8; col++){
                    board[row][col].draw(row,col);
                }
            }


            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }


    }
    public static boolean isPointInSquare(double xPoint, double yPoint, double xCenter, double yCenter, double length){
        if(xPoint > xCenter+length/2.0 || xPoint < xCenter-length/2.0 ||
                yPoint > yCenter+length/2.0 || yPoint < yCenter-length/2.0){
            return false;
        }
        return true;
    }

}

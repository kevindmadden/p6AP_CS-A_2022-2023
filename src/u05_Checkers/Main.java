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

/*
Good:
-Drawing the board well
-The highlights sort of worked

Needs redesigned:
-Overall framework / way we are trying to get the checkers to move
-Making it more complex than it probably needs to be?

-Click on a boardSpace that contains a Checker
    -Unhighlight all board space and all checkers
    -Highlight the checker clicked on
        -Highlight the movement options for the checker
            -Slides
            -Jumps
-Click on a boardSpace that doesn't contain a Checker
    -Unhighlight all board space and all checkers
    -Highlighted space
        -Figure what checker is currently selected
            -Save off this checker in a variable
            -Null-out the checker from the boardSpace it is located on
        -Store the saved-off checker in the highlighed boardSpace that was clicked on
            -If a slide, just move the checker
            -If at jump, null-out the checker jumped over

TODO:
    -Take turns into account
    -Clicking on a highlighted space should trigger the turn to change
 */


public class Main {
    public static void main(String[] args){
        //Creating the board
        BoardSpace[][] board = new BoardSpace[8][8];
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                board[row][col] = new BoardSpace();
            }
        }
        setCheckersInInitialPositions(board);

        StdDraw.setScale(0, 80);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.


        boolean isMousePressedPrevFrame = false;
        boolean isMousePressed = false;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            isMousePressed = StdDraw.isMousePressed();
            boolean wasMouseUnpressed = false;
            if(isMousePressedPrevFrame && !isMousePressed){
                wasMouseUnpressed = true;
            }

            int mouseRowNum = (int)(7.999-StdDraw.mouseY()/10);
            int mouseColNum = (int)(StdDraw.mouseX()/10);

            //we clicked on checker
            if(wasMouseUnpressed && board[mouseRowNum][mouseColNum].getChecker()!=null){
                unhighlightEverything(board);

                Checker clickedChecker = board[mouseRowNum][mouseColNum].getChecker();

                BoardSpace upRight = board[mouseRowNum-1][mouseColNum+1];
                if(upRight.getChecker() == null && clickedChecker.getPlayerNum()==2){
                    board[mouseRowNum-1][mouseColNum+1].setIsHighlighted(true);
                }
                BoardSpace upLeft = board[mouseRowNum-1][mouseColNum-1];
                if(upLeft.getChecker() == null && clickedChecker.getPlayerNum()==2){
                    board[mouseRowNum-1][mouseColNum-1].setIsHighlighted(true);
                }

                board[mouseRowNum][mouseColNum].getChecker().setIsHighlighted(true);

            }else if(wasMouseUnpressed && board[mouseRowNum][mouseColNum].getChecker()==null){ //we didn't click on checker
                if(board[mouseRowNum][mouseColNum].getIsHighlighted()){ //we clicked on highlighted space
                    for(int row=0; row<8; row++){
                        for(int col=0; col<8; col++){
                            Checker tempChecker = board[row][col].getChecker();
                            //if a checker exists at this board space and the checker is highlighted, we want to remove that checker from the board.
                            if(tempChecker != null && tempChecker.getIsHighlighted()){
                                board[row][col].removeChecker();
                                board[mouseRowNum][mouseColNum].setChecker(tempChecker);
                            }
                        }
                    }


                }

                unhighlightEverything(board);
            }



            drawBoard(board);

            isMousePressedPrevFrame = isMousePressed;
            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }


    }

    public static void unhighlightEverything(BoardSpace[][] board){
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                board[row][col].setIsHighlighted(false);
                Checker tempChecker = board[row][col].getChecker();
                if(tempChecker != null){
                    tempChecker.setIsHighlighted(false);
                }
            }
        }
    }

    public static void drawBoard(BoardSpace[][] board){
        //Draw red bg
        StdDraw.setPenColor(new Color(93, 7, 7));
        StdDraw.filledSquare(40,40,40);

        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                board[row][col].draw(row,col);
            }
        }
    }

    public static void setCheckersInInitialPositions(BoardSpace[][] board){
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
    }

    public static boolean isPointInSquare(double xPoint, double yPoint, double xCenter, double yCenter, double length){
        if(xPoint > xCenter+length/2.0 || xPoint < xCenter-length/2.0 ||
                yPoint > yCenter+length/2.0 || yPoint < yCenter-length/2.0){
            return false;
        }
        return true;
    }

}

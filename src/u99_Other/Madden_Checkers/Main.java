package u99_Other.Madden_Checkers;

import java.awt.*;

public class Main {
     /*
        1. If a board space is clicked on that contains a checker...
               (i) Un-highlight all board spaces and checkers
               (ii) -Highlight the checker that was clicked on
                    -Highlight the spaces the checker can move to
        2. If a board space is clicked on that does NOT contain a checker...
               (i) If the board space is NOT highlighted...
                     -Unhighlight all board spaces and checkers
               (ii) If the board space is highlighted...
                    (a) Locate highlighted checker.
                    (b) Null out the boardSpace where the highlighted checker is currently located.
                    (c) Store the checker in the highlighted board space that was just clicked on.
                    (d) Unhighlight all board spaces and checkers

         */

    public static void main(String[] args) {
        //Board is 80x80
        StdDraw.setScale(0, 80);
        //Create board and place checkers in starting positions
        BoardSpace[][] board = new BoardSpace[8][8];
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                board[row][col] = new BoardSpace();
            }
        }
        setupBoard(board);

        //Variable for tracking mouse clicks
        boolean isMousePressedPrevFrame = false;
        boolean isMousePressed = false;

        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.
        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while (true) {
            //wasMouseUnpressed will indicate if the mouse was released and where it was released
            isMousePressed = StdDraw.isMousePressed();
            boolean wasMouseUnpressed = false;
            if(isMousePressedPrevFrame && !isMousePressed){
                wasMouseUnpressed = true;
            }




            drawBoard(board);
            isMousePressedPrevFrame = isMousePressed; //save off state of isMousePressed so it can be accessed at the beginning of the next frame
            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int) (timeElapsed * 1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }

    public static void setupBoard(BoardSpace[][] board){
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

    public boolean isPointInSquare(double xPoint, double yPoint, double xCenter, double yCenter, double length){
        if(xPoint > xCenter+length/2.0 || xPoint < xCenter-length/2.0 ||
                yPoint > yCenter+length/2.0 || yPoint < yCenter-length/2.0){
            return false;
        }
        return true;
    }


    public static boolean didCirlecRectColl(double rect_x, double rect_y, double rect_halfWidth, double rect_halfHeight, double circle_x, double circle_y, double circle_r) {
        rect_x = rect_x - rect_halfWidth;
        rect_y = rect_y - rect_halfHeight;
        double rect_w = rect_halfWidth*2;
        double rect_h = rect_halfHeight*2;
        double distX = Math.abs(circle_x - rect_x - rect_w / 2);
        double distY = Math.abs(circle_y - rect_y - rect_h / 2);

        if (distX > (rect_w / 2 + circle_r)) {
            return false;
        }
        if (distY > (rect_h / 2 + circle_r)) {
            return false;
        }

        if (distX <= (rect_w / 2)) {
            return true;
        }
        if (distY <= (rect_h / 2)) {
            return true;
        }

        double dx = distX - rect_w / 2;
        double dy = distY - rect_h / 2;
        return (dx * dx + dy * dy <= (circle_r * circle_r));
    }

    public static boolean didCircleCircleColl(double cir1_x, double cir1_y, double cir1_r, double cir2_x, double cir2_y, double cir2_r) {
        double distanceBetweenCenters = Math.sqrt(Math.pow(cir2_x - cir1_x, 2) + Math.pow(cir2_y - cir1_y, 2));
        double sumOfRadii = cir1_r + cir2_r;

        if (distanceBetweenCenters > sumOfRadii) {
            return false;
        } else {
            return true;
        }
    }

}

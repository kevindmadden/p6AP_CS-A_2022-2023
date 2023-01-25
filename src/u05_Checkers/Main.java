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

public class Main {

    public static void main(String[] args){
        BoardSpace[][] board = new BoardSpace[8][8];

    }

}

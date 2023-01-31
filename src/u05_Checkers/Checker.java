package u05_Checkers;

public class Checker {
    private int playerNum;
    private boolean isKing;
    private boolean isHighlighted;

    public Checker(int playerNum){
        this.playerNum = playerNum;
    }

    public void draw(int row, int col){
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(5+10*col,75-10*row, 4.5);

    }
}
